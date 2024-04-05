public class Mahasiswa29 {
    public String nama;
    public String nim;
    public char jenisKelamin;
    public double IPK;
    public static double hitungRerataIpk(Mahasiswa29[] mhArray){
        double totIpk = 0;
        for (Mahasiswa29 mh : mhArray) {
            totIpk += mh.IPK;
        }
        return totIpk / mhArray.length;
    }
    public static double cariIpkTertinggi(Mahasiswa29[] mhArray){
        double IpkTinggi = mhArray[0].IPK;
        for (Mahasiswa29 mh : mhArray) {
            if (mh.IPK > IpkTinggi){
                IpkTinggi = mh.IPK;
            }
        }
        return IpkTinggi;
    }
}