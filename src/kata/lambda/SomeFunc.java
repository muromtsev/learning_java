package kata.lambda;

public interface SomeFunc<T> {
    T func(T t);
}

class GenericFnctionalInterfaceDemo {
    public static void main(String[] args) {

        SomeFunc<String> reverse = (str) -> {
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }

            return result;
        };

        System.out.println("Lambda reverse " + reverse.func("Lambda"));
        System.out.println("Expression reverse -> " + reverse.func("Expression"));

        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result *= i;
            }

            return result;
        };

        System.out.println("Factorial 3 equals " + factorial.func(3));
        System.out.println("Factorial 5 equals " + factorial.func(5));

    }
}
