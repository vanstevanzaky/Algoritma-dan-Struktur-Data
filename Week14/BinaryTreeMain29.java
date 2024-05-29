public class BinaryTreeMain29 {
    public static void main(String[] args) {
        BinaryTree29 bt = new BinaryTree29();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        bt.recursion(72);

        System.out.print("PreOrder Traversal  : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("InOrder Traversal   : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("FInd Node : " + bt.find(5));
        System.out.println("Delete Node 8");
        bt.delete(8);
        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("-------------------");
        System.out.println("Data terbesar : ");
        bt.tampilMax();
        System.out.println("-------------------");
        System.out.println("Data terkecil : ");
        bt.tampilMin();
        System.out.println("");

        System.out.println("------------------------");
        System.out.println("Data yang ada di leaf : ");
        bt.tampilLeaf(bt.root);
        System.out.println();

        System.out.println("Jumlah data yang ada di leaf : " + bt.jumlahLeaf());
    }

}
