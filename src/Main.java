
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double d;
        double res = 0;

        while (scan.hasNext()) {
            if (scan.hasNextDouble())  {
                d = scan.nextDouble();
                res += d;
            } else {
                scan.next();
            }
        }

        System.out.printf(Locale.ENGLISH, "%.6f", res);

    }

}


