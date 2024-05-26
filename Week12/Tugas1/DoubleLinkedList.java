public class DoubleLinkedList {
    Node head;
    int size;

    public DoubleLinkedList(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst (int no,String nama){
        if (isEmpty()) {
            head = new Node(null, no, nama, head);
        } else {
            Node newNode = new Node(null, no, nama, head);
            head.prev =  newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(int no, String nama){
        if (isEmpty()) {
            addFirst(no, nama);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, no, nama, null);
            current.next = newNode;
            size++;
        }
    }
    public int size(){
        return size;
    }
    public void clear(){
        head = null;
        size = 0;
    }
    public void print(){
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("|No. "+"\t"+"|"+"Nama "+"\t"+"|");
            while (tmp != null) {
                System.out.println("|"+tmp.no+"\t|"+ tmp.nama+"\t"+"|");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }
    public void removeFirst()throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            String removedName = head.nama;
            removeLast();
            System.out.println(removedName + "telah divaksinasi");
        } else {
            String removedName = head.nama;
            head = head.next;
            head.prev = null;
            size--;
            System.out.println(removedName +"telah divaksinasi");
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus ");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
}
