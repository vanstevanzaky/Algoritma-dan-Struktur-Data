public class Segitiga29{
    public int alas;
    public int tinggi;

    public Segitiga29(int a, int t){
        alas = a;
        tinggi = t;

    }
    double hitungLuas(){
        return ((double)alas * tinggi) /2;
    }
    double hitungKeliling(){
        double sisiMiring = Math.sqrt(alas*alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }
}