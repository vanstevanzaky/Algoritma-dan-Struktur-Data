package TestSearching.P7;
import java.util.Scanner;
public class BukuMain29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        PencarianBuku29 data = new PencarianBuku29();
        int jumBuku = 5;

        System.out.println("--------------------------------------- ");
        System.out.println("Masukkan data Buku secara Urut dari KodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("===============");
            System.out.print("Kode Buku \t: ");
            String kodeBuku = s.nextLine();
            System.out.print("Judul buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t: ");
            int stock = s.nextInt();
            s.nextLine();

            Buku29 m = new Buku29(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("_____________________________________________________");
        System.out.println("_____________________________________________________");
        System.out.println("Data keseluruhan Buku: ");
        data.tampil();

        System.out.print("Cari buku berdasarkan judul: ");
        String cariJudul = s1.nextLine();
        
        data.sort();
        int posisi = data.findSeqSearchJudul(cariJudul);
        System.out.println("sequential search: ");
        data.tampilData(cariJudul, posisi);
        
        System.out.println("binary search: ");
        posisi = data.findJudulBinarySearch(cariJudul, 0, data.listBk.length - 1);
        data.tampilData(cariJudul, posisi);

    }
}