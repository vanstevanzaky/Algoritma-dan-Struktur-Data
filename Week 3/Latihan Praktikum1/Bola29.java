public class Bola29 {
    public double jrJrBola;
    public double phi = 3.14;
    double hitungLuasPermukaanBola(double r){
        jrJrBola = r;
        return 4 * phi * (jrJrBola * jrJrBola);
    }
    double hitungVolumeBola(double r){
        jrJrBola = r;
        return (4.0/3.0)*phi*(jrJrBola * jrJrBola *jrJrBola);
    }  
}