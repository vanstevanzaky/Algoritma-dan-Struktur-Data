
public class Buku29 {
    static String judul, pengarang;
    static int halaman, stok, harga;
    
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