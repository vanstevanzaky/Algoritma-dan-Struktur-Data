import java.util.Scanner;
public class persegiMain29 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       persegi29[][] ppArray = new persegi29[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            ppArray[i][j] = new persegi29();
            System.out.println("Persegi  ke-"+i+"."+j );
            System.out.print("Masukkan panjang: ");
            ppArray[i][j].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar: ");
            ppArray[i][j].lebar = sc.nextInt();  
            }
          
        }
       for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.println("Persegi ke-"+i+"."+j);
            System.out.println("Panjang: "+ppArray[i][j].panjang + ", lebar: "+ppArray[i][j].lebar);
       }
        }
  }     
}
