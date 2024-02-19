import java.util.Scanner;

public class Rumus29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hasil = 0;

            while (true) {
                System.out.println();
                System.out.println("==================================================");
                System.out.println("|              Menu Menghitung Rumus             |");
                System.out.println("==================================================");
                System.out.println("1. Hitung Kecepatan");
                System.out.println("2. Hitung Jarak");
                System.out.println("3. Hitung Waktu");
                System.out.println("4. Keluar");
                System.out.println();
                System.out.print("Pilih Menu : ");
                int menu = input.nextInt();

                if (menu == 4) {
                    break;
                }
                
                switch (menu) {
                    case 1:
                        hasil = hitungKecepatan(input);
                        break;
                    case 2:
                        hasil = hitungJarak(input);
                        break;
                    case 3:
                        hasil = hitungWaktu(input);
                        break;
                    default:
                        System.out.println("Menu tidak valid!");
                        continue;
                }
                System.out.println("Hasil perhitungan: " +hasil);
            }
            
            
    }
    public static double hitungKecepatan(Scanner input) {
        System.out.print("Masukkan jarak (m) : ");
        double jarak = input.nextDouble();
        System.out.print("Masukkan waktu (s) : ");
        double waktu = input.nextDouble();

        double kecepatan = jarak/waktu;
        return kecepatan;
    }
    public static double hitungJarak(Scanner input) {
        System.out.print("Masukkan kecepatan (m/s) : ");
        double kecepatan = input.nextDouble();
        System.out.print("Masukkan waktu (s) : ");
        double waktu = input.nextDouble();

        double jarak = kecepatan * waktu;
        return jarak;
    }
    public static double hitungWaktu(Scanner input) {
        System.out.print("Masukkan jarak (m) : ");
        double jarak = input.nextDouble();
        System.out.print("Masukkan kecepatan (m/s) : ");
        double kecepatan = input.nextDouble();

        double waktu = jarak/kecepatan;
        return waktu;
    }
}