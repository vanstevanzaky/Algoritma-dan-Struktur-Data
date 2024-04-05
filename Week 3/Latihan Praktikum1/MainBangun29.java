import java.util.Scanner;
public class MainBangun29 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Daftar Bangun:");
        System.out.println("1. Kerucut. \n2. Limas. \n3. Bola. ");
        System.out.print("Bangun apa yang ingin anda hitung (1/2/3) : ");
        int bangunPilihan = sc.nextInt();
        if (bangunPilihan == 1) {
            Kerucut29[] ktArray = new Kerucut29[2];
            for (int i= 0; i < ktArray.length; i++) {
             ktArray[i] = new Kerucut29();
             System.out.println("Bangun Kerucut ke-"+i);
             System.out.print("Masukkan Jari jari : ");
             ktArray[i].jariJari = sc.nextDouble();
             System.out.print("Masukkan Sisi Miring : ");
             ktArray[i].sisiMiring = sc.nextDouble();
             
            }
            for (int i = 0; i < ktArray.length; i++) {
                System.out.println("Luas Permukaan Kerucut "+ i + " = "+ ktArray[i].hitungLuasPermukaanKerucut( ktArray[i].jariJari,ktArray[i].sisiMiring));
                System.out.println("Volume Kerucut "+i + " = "+ ktArray[i].hitungVolumeKerucut( ktArray[i].jariJari,ktArray[i].sisiMiring));
            }
        }else if (bangunPilihan == 2) {
            System.out.println("");
            Limas29[] lmArray = new Limas29[2];
            for (int i = 0; i < lmArray.length; i++) {
            lmArray[i] = new Limas29();
            System.out.println("Bangun Limas ke-"+i);
            System.out.print("Masukkan Sisi Alas: ");
            lmArray[i].pjgSisiAlas = sc.nextDouble();
            System.out.print("Masukkan Tinggi Limas: ");
            lmArray[i].tLimas = sc.nextDouble();
            }
            for (int i = 0; i < lmArray.length; i++) {
                System.out.println("Luas Permukaan Limas "+ i + " = "+ lmArray[i].hitungluasPermukaanLimas( lmArray[i].pjgSisiAlas,lmArray[i].tLimas));
                System.out.println("Volume Limas "+i + " = "+ lmArray[i].hitungVolumeLimas( lmArray[i].pjgSisiAlas,lmArray[i].tLimas));
            }
        } else if (bangunPilihan == 3) {
            System.out.println("");
            Bola29[] blArray = new Bola29[2];
            for (int i = 0; i < blArray.length; i++) {
                blArray[i] = new Bola29();
                System.out.println("Bangun Bola ke-"+i);
                System.out.print("Masukkan Jaring-jaring: ");
                blArray[i].jrJrBola = sc.nextDouble();
                
            } 
            for (int i = 0; i < blArray.length; i++) {
                System.out.println("Luas Permukaan Bola "+ i + " = "+ blArray[i].hitungLuasPermukaanBola( blArray[i].jrJrBola));
                System.out.println("Volume Bola "+i + " = "+ blArray[i].hitungVolumeBola( blArray[i].jrJrBola));
            }
        } else {
            System.out.println("Pilihan Bangun Tidak Valid: ");
            return;
        }
       
       

    }
    
}