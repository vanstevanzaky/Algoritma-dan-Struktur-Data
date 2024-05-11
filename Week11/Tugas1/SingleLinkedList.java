public class SingleLinkedList {
    Node1_29 head, tail;
    int size = 0;

    boolean isEmpty() {
        return head == null;
    }

    void print () {
            Node1_29 temp = head;
            System.out.println("Isi Linked List : ");
            while (temp != null) {
                System.out.println("Mahasiswa " + temp.urut);
                System.out.println("NIM  : " + temp.nim);
                System.out.println("Nama : " + temp.nama);
                temp = temp.next;
            }
            System.out.println("");
    }

    void addFirst(int nim, String nama) {
        Node1_29 ndInput = new Node1_29(++size, nim, nama);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput; 
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    
    void addLast(int nim, String nama) {
        Node1_29 ndInput = new Node1_29(++size, nim, nama);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    
    void insertAfter (int key, int nim, String nama) {
        Node1_29 temp = head;
        while (temp != null && temp.nim != key) {
            temp = temp.next;
            if (temp == null) {
                System.out.println("Tidak ditemukan.");
            }
            Node1_29 ndInput = new Node1_29(++size, nim, nama);
            ndInput.next = temp.next;
            temp.next = ndInput;
            if (ndInput.next == null) {
                tail = ndInput;
            }
        }
    }
    
    void insertAt(int index, int nim, String nama) {
        if (index < 0 || index > size) {
            System.out.println("Index tidak valid!");
            return;
        } else if (index == 0) {
            addFirst(nim, nama);
        } else if (index == size) {
            addLast(nim, nama);
            return;
        } else {
            Node1_29 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node1_29 newNode = new Node1_29(++size, nim, nama);
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    
}