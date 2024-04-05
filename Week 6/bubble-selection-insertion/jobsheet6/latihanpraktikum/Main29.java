package jobsheet6.latihanpraktikum;

public class Main29 {
    public static void main(String[] args) {
        HotelService29 list = new HotelService29();
        Hotel29 ht1 = new Hotel29("Soehat Smart Hotel", "Malang", 500000, (byte)3);
        Hotel29 ht2 = new Hotel29("Bengawan Hotel ", "Bandung", 700000, (byte)4);
        Hotel29 ht3 = new Hotel29("Pandawa Hotel", "Bali", 400000, (byte)5);
        Hotel29 ht4 = new Hotel29("Satu Dua Hotel ", "Lampung", 200000, (byte)2);
        Hotel29 ht5 = new Hotel29("Jakarta Hotel", "Jakarta", 290000,(byte)1 );
        list.tambah(ht1);
        list.tambah(ht2);
        list.tambah(ht3);
        list.tambah(ht4);
        list.tambah(ht5);
        System.out.println("Data Hotel sebelum disorting = ");
        list.tampilAll();
        System.out.println("============================================================\n");
        System.out.println("Data Hotel setelah disorting bubble sort berdasarkan Harga");
        list.bubbleSortHarga();
        list.tampilAll();
        System.out.println("============================================================\n");
        System.out.println("Data Hotel setelah disorting selectionSort berdasarkan Harga");
        list.SelectionSortHarga();
        list.tampilAll();
        System.out.println("============================================================\n");
        System.out.println("Data Hotel setelah disorting bubble sort berdasarkan Bintang");
        list.SelectionSortBintang();
        list.tampilAll();
        System.out.println("============================================================\n");
        System.out.println("Data Hotel setelah disorting selectionSort berdasarkan Bintang");
        list.SelectionSortBintang();
        list.tampilAll();
 }
}
