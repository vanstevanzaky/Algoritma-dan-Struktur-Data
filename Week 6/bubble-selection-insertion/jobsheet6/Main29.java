package jobsheet6;
import java.util.Scanner;
public class Main29 {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi29 list = new DaftarMahasiswaBerprestasi29();
        Mahasiswa29 m1 = new Mahasiswa29("Nusa", 2017, 25, 3);
        Mahasiswa29 m2 = new Mahasiswa29("Rara", 2012, 19, 4);
        Mahasiswa29 m3 = new Mahasiswa29("Dompu", 2018, 19, 3.5);
        Mahasiswa29 m4 = new Mahasiswa29("Abdul", 2017, 23, 2);
        Mahasiswa29 m5 = new Mahasiswa29("Ummi", 2019, 21, 3.75);
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        System.out.println("Data mahasiswa sebelum disorting = ");
        list.tampil();
        System.out.println("Data Mahasiswa setelah disorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.SelectionSort();
        list.tampil();
        System.out.println("Data Mahasiswa setelah sorting asc berdasarkan ipk");
        list.insertSort();
        list.tampil();
    }
}
