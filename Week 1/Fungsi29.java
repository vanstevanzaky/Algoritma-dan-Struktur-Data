import java.util.Scanner;

public class Fungsi29 {

    public static void main(String[] args) {
        // Array kode plat mobil
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        
        // Array nama kota yang berpasangan dengan kode plat mobil
        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T','E', 'G', 'A', 'L'},

        };

        // Input kode plat nomor
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char kodePlat = input.next().toUpperCase().charAt(0); // Ambil karakter pertama dari input dan ubah menjadi huruf besar

        // Temukan indeks kode plat di dalam array
        int posisiKodePlat = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodePlat) {
                posisiKodePlat = i;
                break;
            }
        }

        // Tampilkan nama kota yang sesuai atau pesan kesalahan jika kode tidak ditemukan
        if (posisiKodePlat != -1) {
            System.out.print("Kota: ");
            for (char c : KOTA[posisiKodePlat]) {
                System.out.print(c);
            }
            System.out.println();
        } else {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
