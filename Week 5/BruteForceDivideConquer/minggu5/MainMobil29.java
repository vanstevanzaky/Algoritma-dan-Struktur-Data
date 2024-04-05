package minggu5;
    import java.util.Scanner;
    public class MainMobil29 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Mobil29[] dataMobil = {
                new Mobil29("BMW", "M2 Coupe", 2016, 6816, 728),
                new Mobil29("Ford", "Fiesta ST", 2014, 3921, 575),
                new Mobil29("Nissan", "370Z", 2009, 4360, 657),
                new Mobil29("Subaru", "BRZ", 2014, 4058, 609),
                new Mobil29("Subaru", "Impreza WRX STI", 2013, 6255, 703),
                new Mobil29("Toyota", "AE86 Trueno", 1986, 3700, 553),
                new Mobil29("Toyota", "86/GT86", 2014, 4180, 609),
                new Mobil29("Volkswagen", "Golf GTI", 2014, 4108, 631)
            };
            boolean kondisi = true;
            do {
                System.out.println("\n\n");
                System.out.println("======================================");
                System.out.println("|  Selamat Datang Di Showrrom Mobil  |");
                System.out.println("|              STEVAN FAST           |");
                System.out.println("======================================");
                System.out.println("");
                System.out.println("Menu Fitur Showrrom");
                System.out.println("1. Spesifikasi Mobil");
                System.out.println("2. Top Acceleration Tertinggi menggunakan Divide and Conquer ");
                System.out.println("3. Top Acceleration Terendah menggunakan Divide and Conquer ");
                System.out.println("4. Rata-rata Top Power dari seluruh mobil29 menggunakan Brute Force ");
                System.out.println("5. Keluar Program ");
                System.out.print("Tentukan pilihanmu (1/2/3/4): ");
                int pilihan = sc.nextInt();
                switch (pilihan) {
                    case 1:
                    for (int i = 0; i < dataMobil.length ;i++) {
                        System.out.println("Spesifikasi Mobil ke-" + (i + 1) + ":");
                        System.out.println("Merk: " + dataMobil[i].merk);
                        System.out.println("Tipe: " + dataMobil[i].tipe);
                        System.out.println("Tahun: " + dataMobil[i].tahun);
                        System.out.println("Top Acceleration: " + dataMobil[i].topAcceleration);
                        System.out.println("Top Power: " + dataMobil[i].topPower);
                        System.out.println("");
                    }
                    break;

                    case 2:
                    double akselerasiMax = Mobil29.cariAkselerasiMax(dataMobil, 0, dataMobil.length - 1);
                    System.out.println("\n Top Acceleration Tertinggi menggunakan Divide and Conquer: " + akselerasiMax);
                    break;

                    case 3:
                    double akselerasimin = Mobil29.cariAkselerasiMin(dataMobil, 0, dataMobil.length - 1);
                    System.out.println("\n Top Acceleration Terendah menggunakan Divide and Conquer: " + akselerasimin);
                    break;

                    case 4:
                    double rataRataPower = Mobil29.hitungRataRataTopPower(dataMobil);
                    System.out.println("\n Rata-rata Top Power dari seluruh mobil29 menggunakan Brute Force: " + rataRataPower);
                    break;

                    case 5:
                    System.out.println("Terimakasih Telah Berkunjung di Showroom kami");
                    kondisi = false;
                    break;

                    default:
                    System.out.println("Pilihan Tidak Valid Silahkan Ulang");
                    break;
                }
                
            } while (kondisi == true);
    
           
        }
}
