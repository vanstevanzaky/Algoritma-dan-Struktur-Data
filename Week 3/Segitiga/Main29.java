/**
 * main
 */
public class Main29 {

    public static void main(String[] args) {
        Segitiga29[] sgArray = new Segitiga29[4];
        sgArray[0] = new Segitiga29(10, 4);
        sgArray[1] = new Segitiga29(20, 10);
        sgArray[2] = new Segitiga29(15, 1);
        sgArray[3] = new Segitiga29(25, 10);
        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Segitiga ke- "+i+". Luas = "+ sgArray[i].hitungLuas()+". Keliling = "+ sgArray[i].hitungKeliling());
        }
    }
}