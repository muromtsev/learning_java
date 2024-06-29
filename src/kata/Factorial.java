package kata;
import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {

        BigInteger r = factorial(12);
        System.out.println(r);

    }

    public static BigInteger factorial(int value) {
        BigInteger num = BigInteger.valueOf(value);
        BigInteger result = BigInteger.valueOf(1);

        if (value == 0) {
            return BigInteger.valueOf(1);
        }
        if (value <= 2) {
            return BigInteger.valueOf(value);
        }

        for (int i = 1; i <= num.intValue(); i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;

    }
}
