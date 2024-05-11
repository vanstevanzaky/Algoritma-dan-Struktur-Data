public class Node {
    int nim;
    String nama;
    String keperluan;
    Node next;
    public Node(int nim, String nama, String keperluan){
        this.nim = nim;
        this.nama = nama;
        this.keperluan =  keperluan;
        this.next = null;
    }
}