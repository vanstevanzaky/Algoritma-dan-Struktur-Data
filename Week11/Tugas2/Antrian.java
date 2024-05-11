public class Antrian {
    private Node head;
    private Node tail;
    private int size;

    public Antrian() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(int nim, String nama, String keperluan) {
        Node ndInput = new Node(nim, nama, keperluan);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        size++;
    }

    public Node removeFirst() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong!");
            return null;
        }

        Node temp = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return temp;
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong!");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println("NIM: " + temp.nim);
            System.out.println("Nama: " + temp.nama);
            System.out.println("Keperluan: " + temp.keperluan);
            System.out.println("----------");
            temp = temp.next;
        }
    }
}