public class Limas29 {
    public double pjgSisiAlas;
    public double tSegitiga;
    public double tLimas;
    double hitungluasPermukaanLimas(double pjgSAlas, double tLms){
        pjgSisiAlas = pjgSAlas;
        tLimas = tLms;
        return (double)(pjgSisiAlas * pjgSisiAlas)+(2*pjgSisiAlas*tLimas);
    }
    double hitungVolumeLimas(double pjgSAlas,double tLms){
        pjgSisiAlas = pjgSAlas;
        tLimas = tLms;
        tLimas = Math.sqrt((tLimas*tLimas)-((pjgSisiAlas*pjgSisiAlas)/2) );
        return (1.0/3.0)*(pjgSisiAlas*pjgSisiAlas)*tLimas;
    }
}