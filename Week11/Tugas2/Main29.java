import java.util.Scanner;

public class Main29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Antrian antri = new Antrian();

        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan Antrian");
            System.out.println("2. Masukkan Mahasiswa ke Antrian");
            System.out.println("3. Layani Mahasiswa");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1/2/3/4): ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\nAntrian saat ini:");
                    antri.tampilkanAntrian();
                    break;
                case 2:
                    System.out.print("\nMasukkan NIM mahasiswa: ");
                    int nim = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Masukkan Nama mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Keperluan: ");
                    String keperluan = sc.nextLine();
                    antri.addLast(nim, nama, keperluan);
                    System.out.println("Mahasiswa berhasil dimasukkan ke dalam antrian.");
                    break;
                case 3:
                    Node mhs = antri.removeFirst();
                    if (mhs != null) {
                        System.out.println("\nMahasiswa yang dilayani:");
                        System.out.println("NIM: " + mhs.nim);
                        System.out.println("Nama: " + mhs.nama);
                        System.out.println("Keperluan: " + mhs.keperluan);
                    }
                    break;
                case 4:
                    lanjut = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        sc.close();
        System.out.println("Program selesai.");
    }
}
