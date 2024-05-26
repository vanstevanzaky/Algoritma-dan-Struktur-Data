
public class Node29 {
    int id;
    String judul;
    double rating;
    Node29 prev, next;

    Node29(Node29 prev, int id, String judul, double rating, Node29 next){
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
    }
}