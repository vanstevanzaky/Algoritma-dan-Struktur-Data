package jobsheet6.latihanpraktikum;

public class HotelService29 {
    Hotel29 rooms[] = new Hotel29[5];
    int idx;
    void tambah(Hotel29 H){
        if (idx < rooms.length) {
            rooms[idx] = H;
            idx++;
        } else{
            System.out.println("Data sudah penuh!!");
        }
    }
    void tampilAll(){
      for (Hotel29 hotel : rooms) {
         System.out.println("Nama Hotel = "+ hotel.nama);
         System.out.println("Kota = "+hotel.kota);
         System.out.println("Harga = "+ hotel.harga);
         System.out.println("Bintang  = "+hotel.bintang);
      }
    }
    void bubbleSortHarga(){
        for(int i=0; i<rooms.length-1; i++){
            for(int j=1; j<rooms.length-i;j++){
                if (rooms[j].harga< rooms[j-1].harga) {
                    Hotel29 tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }
    void SelectionSortHarga(){
        for (int i = 0; i < rooms.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j > rooms.length; j++) {
                if (rooms[j].harga < rooms[idxMin].harga) {
                    idxMin = j;
                }
            }
            Hotel29 tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp;
        }
    }
    void bubbleSortBintang(){
        for(int i=0; i<rooms.length-1; i++){
            for(int j=1; j<rooms.length-i;j++){
                if (rooms[j].bintang > rooms[j-1].bintang) {
                    Hotel29 tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }
    void SelectionSortBintang(){
        for (int i = 0; i < rooms.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[idxMin].bintang) {
                    idxMin = j;
                }
            }
            Hotel29 tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp;
        }
    }
}
