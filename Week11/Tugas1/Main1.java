public class Main1 {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();

        singLL.addFirst(111, "Anton");
        singLL.print();
        singLL.addLast(112, "Prita");
        singLL.print();
        singLL.insertAfter(112, 113, "Yusuf");
        singLL.print();
        singLL.insertAt(3, 114, "Doni");
        singLL.print();
        singLL.insertAt(4, 115, "Sari");
        singLL.print();
        
    }
} 