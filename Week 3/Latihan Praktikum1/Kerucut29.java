public class Kerucut29 {
    public double phi = 3.14;
    public double jariJari;
    public double sisiMiring;
    public double tinggiKerucut;
    double hitungLuasPermukaanKerucut(double r, double sM){   
        jariJari = r;
        sisiMiring = sM;     
        return phi * jariJari *(jariJari+sisiMiring);
    }
    double hitungVolumeKerucut(double r, double sM){
        jariJari = r;
        sisiMiring = sM; 
        tinggiKerucut = Math.sqrt(jariJari*jariJari + sisiMiring*sisiMiring);
        return (double)(1.0/3.0)*phi*(jariJari*jariJari)*tinggiKerucut;
    }
}