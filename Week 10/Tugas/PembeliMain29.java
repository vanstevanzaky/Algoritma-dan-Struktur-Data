package Tugas;
import java.util.Scanner;
public class PembeliMain29 {
    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian Pelanggan baru");
        System.out.println("2. Antrian Pelanggan keluar");
        System.out.println("3. Cek Pelanggan terdepan");
        System.out.println("4. Cek semua Pelanggan");
        System.out.println("5. Cek Antrian Pelanggan di posisi belakang");
        System.out.println("6. Cek Posisi Pelanggan");
        System.out.println("7. Tampilkan daftar Pelanggan");
        System.out.println("----------------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc.nextInt();
        Queue29 antri = new Queue29(jumlah);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Nomor HP : ");
                    int nomorHP = sc.nextInt();
                    sc.nextLine();
                    Pembeli29 ps = new Pembeli29(nama, nomorHP);
                    antri.Enqueue(ps);
                    break;
                case 2:
                    Pembeli29 data = antri.Dequeue();
                    if (data != null)
                        System.out.println("Antrian yang keluar : " + data.nama + " " + data.noHp);
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.print("Nama Pelanggan : ");
                    String namaPelanggan = sc.nextLine();
                    antri.peekPosition(namaPelanggan);
                    break;
                case 7:
                    antri.daftarPembeli();
                    break;
            }
        } while (pilih >= 1 && pilih <= 7);
    }
}