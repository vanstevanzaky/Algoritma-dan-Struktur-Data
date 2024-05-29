package Graph;
 //import java .util.Scanner;
public class GraphMain29 {
    public static void main(String[] args) throws Exception {
        //Scanner sc = new Scanner(System.in);
        // Graph29 gedung = new Graph29(6);

        // gedung.addEdge(0, 1, 50);
        // gedung.addEdge(0, 2, 100);
        // gedung.addEdge(1, 3, 70);
        // gedung.addEdge(2, 3, 40);
        // gedung.addEdge(3, 4, 60);
        // gedung.addEdge(4, 5, 80);
        // gedung.degree(0);
        // gedung.printGraph();

        // gedung.removeEdge(1, 3);
        // gedung.printGraph();

        // for (int i = 0; i < 6 ; i++) {
        //     System.out.print("Masukkan asal : ");
        //     int asal = sc.nextInt();
        //     System.out.print("Masukkan tujuan : ");
        //     int tujuan = sc.nextInt();  
            
        //     gedung.cekPath(asal, tujuan);
        //     gedung.printKondisi(asal, tujuan);
        // }

        GraphMatriks29 gdg = new GraphMatriks29(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge.");
        gdg.removeEdge(2, 1);
        gdg.printGraph();
        System.out.println(" ");
        for (int i = 0; i < 4 ; i++) {
        System.out.println("Gedung Berapa yang ingin dicari Degree (1,2,3,4): ");
        gdg.degree(i);

        }
    }
}
