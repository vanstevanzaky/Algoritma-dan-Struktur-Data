public class Gudang29 {
    Barang29[] tumpukan;
    int size, top;
    public Gudang29(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang29[size];
        top = -1;
    }
    public boolean cekKosong(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean cekPenuh(){
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }
    public void tambahBarang(Barang29 brg){
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang "+ brg.nama+" berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }
    public Barang29 ambilBarang(){
        if (!cekKosong()) {
            Barang29 delete = tumpukan[top];
            top--;
            System.out.println("Barang "+ delete.nama +" diambil dari Gudang. ");
            System.out.println("Kode unik dalam biner: "+ konversiDesimalkeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong. ");
            return null;
        }
    }
  
    public Barang29 lihatBarangTeratas(){
        if (!cekKosong()) {
            Barang29 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: "+ barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan Barang kosong.");
            return null;
        }
    }
    public void tampilkanBarang(){
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gedung:");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong. ");
        }
    }
    public String konversiDesimalkeBiner(int kode){
        StackKonversi29 stack = new StackKonversi29();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();

        }
        return biner;
    } 


}
