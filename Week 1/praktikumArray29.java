import java.util.Scanner;
/**
 * praktikumAarray29
 */
public class praktikumArray29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] namaMataKuliah = new String[10];
        int[] bobotSks = new int[10];
        String[] nilaiHuruf = new String[10];
        String lanjut;
        double[] nilaiSetara= new double[10];
        int jumlahMataKuliah = 0, totalSks = 0;
        double ipSemester = 0.0;

        do {
            System.out.print("Inputkan Nama Matakuliah: ");
            namaMataKuliah[jumlahMataKuliah] = input.nextLine();
            System.out.print("Inputkan Bobot SKS: ");
            bobotSks[jumlahMataKuliah] = input.nextInt();
            input.nextLine();
            System.out.print( "Inputkan nilai huruf: ");
            nilaiHuruf[jumlahMataKuliah] = input.nextLine().toUpperCase();
            
            jumlahMataKuliah++;

            System.out.print("Lanjut input? (iya/tidak): ");
            lanjut = input.nextLine();
        } while (lanjut.equalsIgnoreCase("iya") && jumlahMataKuliah < namaMataKuliah.length);

        
        
        for (int i = 0; i < jumlahMataKuliah; i++) {
            switch (nilaiHuruf[i]) {
                case "A":
                    nilaiSetara[i] = 4.0;
                    break;

                case "B+":
                    nilaiSetara[i] = 3.5;
                    break;

                case "B":
                    nilaiSetara[i] = 3;
                    break;

                case "C+":
                    nilaiSetara[i] = 2.5;
                    break;

                case "C":
                    nilaiSetara[i] = 2;
                    break;

                case "D":
                    nilaiSetara[i] = 1;
                    break;

                case "E":
                    nilaiSetara[i] = 0;
                    break;
            
                default:
                System.out.println("Nilai Tidak Valid");
                    break;
            }
            ipSemester += nilaiSetara[i]* bobotSks[i];
            totalSks += bobotSks[i];


        }
         
         System.out.println("\n--- Hasil Perhitungan IP Semester ---");
         System.out.printf("%-40s %-10s \t%5s\n", "MATAKULIAH","NILAI HURUF","NILAI SETARA");
         for (int i = 0; i < jumlahMataKuliah; i++) {
             System.out.printf("%-40s %-10s \t%5s\n", namaMataKuliah[i], nilaiHuruf[i], nilaiSetara[i]);
         }
         
        if (totalSks >0) {
            ipSemester /= totalSks;
            System.out.println("IP Semester: "+ ipSemester);
        } else {
            System.out.println("Tidak ada data matakuliah. ");
        }

        

        



    }
}