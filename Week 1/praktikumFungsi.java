public class praktikumFungsi {
    public static int[][] stokBunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    public static int[] hargaBunga = {75000, 50000, 60000, 10000};
    public static String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    public static int[] penguranganStok = {1, 2, 0, 5};

    public static void main(String[] args) {
        for (int i = 0; i < stokBunga.length; i++) {
            int totalPendapatanCabang = hitungPendapatanCabang(i);
            System.out.println("Pendapatan Royal Garden " + (i + 1) + ": " + totalPendapatanCabang);
            if (i == 3) {
                System.out.println("Stok Bunga di Royal Garden " + (i + 1) + ":");
                hitungStokPerJenisBunga(i);
                System.out.println();
            }
        }
    }

    public static int hitungPendapatanCabang(int cabang) {
        int totalPendapatanCabang = 0;
        for (int i = 0; i < stokBunga[cabang].length; i++) {
            totalPendapatanCabang += stokBunga[cabang][i] * hargaBunga[i];
        }
        return totalPendapatanCabang;
    }

    public static void hitungStokPerJenisBunga(int cabang) {
        for (int i = 0; i < jenisBunga.length; i++) {
            int stok = stokBunga[cabang][i] - penguranganStok[i];
            System.out.println(jenisBunga[i] + ": " + stok);
        }
    }
}
