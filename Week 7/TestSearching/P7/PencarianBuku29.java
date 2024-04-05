package TestSearching.P7;

public class PencarianBuku29 {
    Buku29 listBk[] = new Buku29[5];
    int idx;

    void tambah(Buku29 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }
    void tampil(){
        for ( Buku29 m : listBk){
                m.tampilDataBuku();    
        }
    }
    public int findSearch(String cari){
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++){
            if (listBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    void Tampilposisi(String x, int pos){
        if (pos!= -1) {
            System.out.println("data :"+ x + "ditemukan pada indeks "+ pos);
        } else {
            System.out.println("data "+ x +"tidak ditemukan");
        }
    }
    public void TampilData(String x, int pos) {

        if (pos != -1) {
            System.out.println("Kode Buku\t" + x);
    
            System.out.println("Judul\t: " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t: " + listBk[pos].tahunTerbit);
    
            System.out.println("Pengarang\t: " + listBk[pos].pengarang);
            System.out.println("Stock\t: " + listBk[pos].stock);
    
        } else {
            System.out.println("data " + x + " tidak ditemukan");
    
        }
    }
    public int FindBinarySearch(String cari, int left, int right) {
        if (right >= left) {
            int mid = (right + left) / 2;
            int comparison = cari.compareTo(listBk[mid].kodeBuku);
        
            if (listBk[mid].kodeBuku == cari) {
                return mid;
            } else if (comparison < 0) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        
        return -1; 
    }
    int findSeqSearchJudul(String cari) {
        int count = 0;
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judulBuku.toLowerCase().contains(cari.toLowerCase())) {
                posisi = j;
                count++;
            }
        }
        if (count > 1) {
            System.out.println(count + " data ditemukan dengan judul yang sama!");
        }
        return posisi;
    }

    void sort() {
        int length = listBk.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (listBk[j].judulBuku.compareToIgnoreCase(listBk[j + 1].judulBuku) > 0) {
                    Buku29 temp = listBk[j];
                    listBk[j] = listBk[j + 1];
                    listBk[j + 1] = temp;
                }
            }
        }
    }
    
    int findJudulBinarySearch(String cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
    
            int comparison = listBk[mid].judulBuku.compareToIgnoreCase(cari); 
    
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                return findJudulBinarySearch(cari, mid + 1, right);
            } else {
                return findJudulBinarySearch(cari, left, mid - 1);
            }
        }
        return -1;
    }

    public Buku29 findBuku(String cari) {
        int posisi = findSearch(cari);
        return (posisi != -1) ? listBk[posisi] : null;
    }

    int findBinarySearch(String cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            int comparison = cari.compareToIgnoreCase(listBk[mid].kodeBuku);
        
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    void tampilData(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stok\t : " + listBk[pos].stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }



    
}
