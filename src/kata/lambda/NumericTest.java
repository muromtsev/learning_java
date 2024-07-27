package kata.lambda;

public interface NumericTest {
    boolean test(int n);
}

class LambdaDemo {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n % 2) == 0;

        if (isEven.test(10)) System.out.println("10 - is even");
        if (!isEven.test(3)) System.out.println("3 - is not even");

        NumericTest isNonNeg = (n) -> n >= 0;

        if (isNonNeg.test(1)) System.out.println("1 - isNonNeg");
        if (!isNonNeg.test(-1)) System.out.println("-1 - isNeg");

    }
}
