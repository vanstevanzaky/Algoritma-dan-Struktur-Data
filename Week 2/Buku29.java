
public class Buku29 {
     String judul, pengarang;
     int halaman, stok, harga;
    
     void tampilInformasi(){
        System.out.println("Judul: "+ judul);
        System.out.println("Pengarang: "+ pengarang);
        System.out.println("Jumlah Halaman: "+ halaman);
        System.out.println("Sisa stok: "+ stok);
        System.out.println("Harga: Rp " + harga);

    }
    void terjual(int jml) {
    if (stok > 0) {
        stok -= jml;
    }else{
        return;
    }
        
    }
    void restock(int n){
        stok+= n;
    }
    void gantiHarga(int hrg){
        harga = hrg;
    }

    int hitungHargaTotal(){
        return harga * stok;
    }
    int hitungDiskon(){
        int hrgTotal = hitungHargaTotal();
        if (hrgTotal > 150000) {
            return (int) (0.12 * hrgTotal); // Diskon 12%
        } else if (hrgTotal >= 75000 && hrgTotal <= 150000) {
            return (int) (0.05 * hrgTotal); // Diskon 5%
        } else {
            return 0; // Tidak ada diskon
        }
    }
    int hitungHargaBayar(){
        return hitungHargaTotal() - hitungDiskon();
    }
    
    public Buku29(){

    }
    public Buku29(String jud,String pg,int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }   
}