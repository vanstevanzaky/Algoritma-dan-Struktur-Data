package minggu5;

public class Mobil29 {
    String merk, tipe;
    int tahun;
    double topAcceleration, topPower;

    public Mobil29(String merk, String tipe, int tahun, double topAcceleration, double topPower) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAcceleration = topAcceleration;
        this.topPower = topPower;
    }

     static double cariAkselerasiMax(Mobil29[] data, int low, int high) {
        if (low == high) {
            return data[low].topAcceleration;
        } else {
            int mid = (low + high) / 2;
            double kiriMaks = cariAkselerasiMax(data, low, mid);
            double kananMaks = cariAkselerasiMax(data, mid + 1, high);
            return Math.max(kiriMaks, kananMaks);
        }
    }

     static double cariAkselerasiMin(Mobil29[] data, int low, int high) {
        if (low == high) {
            return data[low].topAcceleration;
        } else {
            int mid = (low + high) / 2;
            double kiriMin = cariAkselerasiMin(data, low, mid);
            double kananMin = cariAkselerasiMin(data, mid + 1, high);
            return Math.min(kiriMin, kananMin);
        }
    }

     static double hitungRataRataTopPower(Mobil29[] data) {
        double totalPower = 0;
        for (Mobil29 mobil : data) {
            totalPower += mobil.topPower;
        }
        return totalPower / data.length;
    }
}

