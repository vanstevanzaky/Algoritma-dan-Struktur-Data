import java.util.Scanner;
public class MainIpk29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Berapa Mahasiswa yang anda ingin data: ");
        int banyaknya = sc.nextInt();
        Mahasiswa29[] mhArray = new Mahasiswa29[banyaknya];
        sc.nextLine();
        for (int i = 0; i < mhArray.length; i++) {
            mhArray[i] = new Mahasiswa29();
            System.out.println("Masukkan data Mahasiswa ke- "+(i+1));
            System.out.print("Masukkan nama : ");
            mhArray[i].nama = sc.nextLine();
            System.out.print("Masukkan nim : ");
            mhArray[i].nim = sc.nextLine();
            System.out.print("Masukkan jenis kelamin : ");
            mhArray[i].jenisKelamin = sc.next().charAt(0);
            System.out.print("Masukkan IPK : ");
            mhArray[i].IPK = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("");
        for (int i = 0; i < mhArray.length; i++) {
            System.out.println("Data Mahasiswa ke- "+(i+1));
            System.out.println("nama : "+mhArray[i].nama);
            System.out.println("nim : "+mhArray[i].nim);
            System.out.println("Jenis Kelamin : "+mhArray[i].jenisKelamin);
            System.out.println("Nilai IPK : "+mhArray[i].IPK);
        }
        double RerataIpk = Mahasiswa29.hitungRerataIpk(mhArray);
        System.out.println("Rata-rata IPK: "+ RerataIpk);
        double IpkTinggi = Mahasiswa29.cariIpkTertinggi(mhArray);
        System.out.println("IPK Tertinggi: "+IpkTinggi);
    }
  
}