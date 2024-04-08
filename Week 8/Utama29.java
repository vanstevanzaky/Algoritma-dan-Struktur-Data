import java.util.Scanner;
public class Utama29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kapasitas gudang : ");
        int kapasitasGudang = scanner.nextInt();
        scanner.nextLine();
        Gudang29 gudang = new Gudang29(kapasitasGudang);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Tampilkan barang teratas");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();

                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();

                    Barang29 barangBaru = new Barang29(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                System.out.println("Pilihan tidak valid. Silahkan coba lagi");

            }

        }
    }
    
    
}
