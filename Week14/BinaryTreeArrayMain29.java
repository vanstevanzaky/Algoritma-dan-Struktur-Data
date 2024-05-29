public class BinaryTreeArrayMain29 {
    public static void main(String[] args) {
        
        BinaryTreeArray29 bta = new BinaryTreeArray29();
        int [] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");
        
        System.out.println("---------------------------");
        bta.add(45);
        bta.add(25);
        System.out.println("Method Traverse Pre Order");
        bta.traversePreOrder(0);
        System.out.println();
        System.out.println("Method Traverse Post Order");
        bta.traversePostOrder(0);
        System.out.println();

    }
}
