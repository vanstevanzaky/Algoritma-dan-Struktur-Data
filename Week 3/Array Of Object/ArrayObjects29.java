import java.util.Scanner;
public class ArrayObjects29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang dari array ppArray: ");
        int pjgPpArray = sc.nextInt();
        PersegiPanjang29[] ppArray = new PersegiPanjang29[pjgPpArray];
        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang29();
            System.out.println("Persegi panjang ke-"+ i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }
       for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-"+i);
            System.out.println("Panjang: "+ppArray[i].panjang + ", lebar: "+ppArray[i].lebar);
       }
  }     
}