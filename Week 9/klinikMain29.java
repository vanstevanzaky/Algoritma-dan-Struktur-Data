import java.util.Scanner;
public class klinikMain29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Berapa banyak Pasien: ");
        int bykPasien29 = scanner.nextInt();
        pasien29[] pasien29 = new pasien29[bykPasien29];
        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Menu Data Pasien");
            System.out.println("2. Mengurutkan Pasien Ascending");
            System.out.println("3. Mengurutkan Pasien Descending ");
            System.out.println("4. Cari Pasien dengan Usia");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            int pilih = scanner.nextInt();
            switch (pilih) {
                case 1:
                for (int i = 0; i < pasien29.length; i++) {
                    scanner.nextLine();
                    System.out.println("Masukkan data untuk Pasien ke-" + (i + 1) + ":");
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Usia: ");
                    int usia = Integer.parseInt(scanner.nextLine());
                    System.out.print("Alamat: ");
                    String alamat = scanner.nextLine();
                    pasien29[i] = new pasien29(nama, usia, alamat);
                }
                break;
                case 2:
                klinikDokter29.urutkanBerdasarkanUsiaAscending(pasien29);
                System.out.println("\nDiurutkan berdasarkan usia (menaik):");
                klinikDokter29.cetakDaftar(pasien29);
                break;
                case 3:
                klinikDokter29.urutkanBerdasarkanUsiaDescending(pasien29);
                System.out.println("\nDiurutkan berdasarkan usia (menurun):");
                klinikDokter29.cetakDaftar(pasien29);
                break;
                case 4:
                System.out.print("\nMasukkan usia yang ingin dicari: ");
                scanner.nextLine();
                int usiaCari = Integer.parseInt(scanner.nextLine());
                pasien29 pasienDitemukan = klinikDokter29.cariPasienDenganUsia(pasien29, usiaCari);
                if (pasienDitemukan != null) {
                    System.out.println("\nPasien dengan usia = " + usiaCari + " ditemukan:");
                    System.out.println(pasienDitemukan);
                } else {
                    System.out.println("\nPasien dengan usia = " + usiaCari + " tidak ditemukan.");
                }
                break;
                case 5:
                System.exit(0);
                break;
                default:
                System.out.println("Pilihan Tidak Valid, Silahkan Coba Lagi");
            }
        }
        

   }
}
