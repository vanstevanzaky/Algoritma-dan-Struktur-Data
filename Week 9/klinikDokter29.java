public class klinikDokter29 {
        public static void cetakDaftar(pasien29[] daftar) {
            for (pasien29 psn29 : daftar) {
                System.out.println(psn29);
            }
        }
    
        public static void urutkanBerdasarkanUsiaAscending(pasien29[] daftar) {
            for (int i = 0; i < daftar.length - 1; i++) {
                for (int j = i + 1; j < daftar.length; j++) {
                    if (daftar[i].getUsia() > daftar[j].getUsia()) {
                        pasien29 temp = daftar[i];
                        daftar[i] = daftar[j];
                        daftar[j] = temp;
                    }
                }
            }
        }
    
        public static void urutkanBerdasarkanUsiaDescending(pasien29[] daftar) {
            for (int i = 0; i < daftar.length - 1; i++) {
                for (int j = i + 1; j < daftar.length; j++) {
                    if (daftar[i].getUsia() < daftar[j].getUsia()) {
                        pasien29 temp = daftar[i];
                        daftar[i] = daftar[j];
                        daftar[j] = temp;
                    }
                }
            }
        }
    
        public static pasien29 cariPasienDenganUsia(pasien29[] daftar, int usia) {
            for (pasien29 psn29 : daftar) {
                if (psn29.getUsia() == usia) {
                    return psn29;
                }
            }
            return null;
        }
    }
    
