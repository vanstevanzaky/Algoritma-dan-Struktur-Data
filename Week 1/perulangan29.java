/**
 * perulangan29
 */
import java.util.Scanner;
public class perulangan29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nim;
        int n;

        System.out.print("Inputkan NIM : ");
        nim = input.nextLine();

        n = Integer.parseInt(nim.substring(nim.length()-2));

        if(n < 10){
            n+=10;
        }
        System.out.println("Maka n = "+n);
        for (int i = 0; i <= n; i++) {
            if (i==6 || i==10) {
                continue;
            }else if(i % 2 == 0){
                System.out.print(i+" ");
            } else{
                System.out.print("* ");
            }
        }
    }
}