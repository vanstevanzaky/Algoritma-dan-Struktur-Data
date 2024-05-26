import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.print("No Antrian: ");
                    int no = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Penerima: ");
                    String nama = sc.nextLine();
                    dll.addLast(no, nama);
                    break;
                case 2:
                dll.removeFirst();
                break;

                case 3:
                dll.print();
                System.out.print("Sisa Antrian: "+dll.size());
                System.out.println("");
                break;

                default:
                break;
            }
        } while (pilih != 4);  




    }
    public static void menu(){
        System.out.println("===============================");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("===============================");
        System.out.println();
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("================================");
        System.out.print("Pilihan Menu: ");
    }
}
