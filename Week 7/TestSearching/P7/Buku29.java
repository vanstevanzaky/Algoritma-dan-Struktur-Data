package TestSearching.P7;

public class Buku29 {
    public String kodeBuku;
    public String judulBuku;
    public int tahunTerbit;
    public String pengarang;
    public int stock;

    public Buku29(String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock){
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;


    }
    public void tampilDataBuku(){
        System.out.println("===========================");
        System.out.println("Kode Buku : "+kodeBuku);
        System.out.println("Judul Buku : "+judulBuku);
        System.out.println("Tahun Terbit : "+tahunTerbit);
        System.out.println("Pengarang : "+pengarang);
        System.out.println("Stock : "+stock);
    }
}
