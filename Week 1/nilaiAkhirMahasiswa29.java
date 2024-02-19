import java.util.Scanner;
/**
 * nilaiAkhirMahasiswa29
 */
public class nilaiAkhirMahasiswa29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilaiTugas,nilaiKuis,nilaiUts,nilaiUas, nilaiAkhir;
        String nilaiHuruf= "";
        System.out.print( "Masukkan Nilai Tugas: ");
        nilaiTugas = input.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = input.nextDouble();
        System.out.print("Masukkan Nilai Nilai UTS: ");
        nilaiUts = input.nextDouble();
        System.out.print("Masukkan Nilai Uas: ");
        nilaiUas = input.nextDouble();

        System.out.println("============================");
        System.out.println("============================");

        if (nilaiTugas <0 ||  nilaiTugas>100 || nilaiKuis <0 || nilaiKuis>100 || nilaiUts<0 || nilaiUts>100|| nilaiUas <0 || nilaiUas>100) {
            System.out.println("Nilai Tidak Valid");
            System.out.println("============================");
            System.out.println("============================");
            
        } else{
            // Untuk mengikuti ketentuan dimana Nilai Akhir nya memiliki persen sesuai Jobsheet
            nilaiAkhir = (nilaiKuis * 0.2)+(nilaiTugas * 0.2)+(nilaiUts * 0.3)+ (nilaiUas * 0.4);
            if (nilaiAkhir > 80 ) {
                System.out.println("Nilai Akhir = "+nilaiAkhir);
                nilaiHuruf = "A";
                System.out.println("Nilai Huruf = "+nilaiHuruf);
            } else if (nilaiAkhir > 73 ) {
                System.out.println("Nilai Akhir = "+nilaiAkhir);
                nilaiHuruf = "B+";
                System.out.println("Nilai Huruf = "+nilaiHuruf);
            } else if (nilaiAkhir > 65 ) {
                System.out.println("Nilai Akhir = "+nilaiAkhir);
                nilaiHuruf = "B";
                System.out.println("Nilai Huruf = "+nilaiHuruf);
            } else if (nilaiAkhir > 60 ) {
                System.out.println("Nilai Akhir = "+nilaiAkhir);
                nilaiHuruf = "C+";
                System.out.println("Nilai Huruf = "+nilaiHuruf);
            } else if (nilaiAkhir > 50 ) {
                System.out.println("Nilai Akhir = "+nilaiAkhir);
                nilaiHuruf = "C";
                System.out.println("Nilai Huruf = "+nilaiHuruf);
            } else if (nilaiAkhir > 39 ) {
                System.out.println("Nilai Akhir = "+nilaiAkhir);
                nilaiHuruf = "D";
                System.out.println("Nilai Huruf = "+nilaiHuruf);
            } else{
                System.out.println("Nilai Akhir = "+nilaiAkhir);
                nilaiHuruf = "E";
                System.out.println("Nilai Huruf = "+nilaiHuruf);
            }
            System.out.println("============================");
            System.out.println("============================");
            if (nilaiHuruf.equalsIgnoreCase("A") || nilaiHuruf.equalsIgnoreCase("B+") ||nilaiHuruf.equalsIgnoreCase("B")
            || nilaiHuruf.equalsIgnoreCase("C+") || nilaiHuruf.equalsIgnoreCase("C") ) {
                System.out.println("Keterangan = LULUS ");
            } else if (nilaiHuruf.equalsIgnoreCase("D") || nilaiHuruf.equalsIgnoreCase("E")) {
                System.out.println("Keterangan = TIDAK LULUS");
            }
        }
        
        
        
        
            
        

    }
}