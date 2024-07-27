package kata.lambda;

public interface StringFuncArgument {
    String func(String n);
}

class LambdasAsArgumentsDemo {
    static String stringOp(StringFuncArgument sfa, String s) {
        return sfa.func(s);
    }

    public static void main(String[] args) {

        String inStr = " Lambdas add power to Java";
        String outStr;

        System.out.println("Before inStr: " + inStr);

        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("After inStr: " + outStr);

        outStr = stringOp((str) -> {
            String result = "";
            int i;

            for (i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    result += str.charAt(i);
                }
            }
            return result;
        }, inStr);

        System.out.println("Стрка после удаления пробелов " + outStr);

        StringFuncArgument reverse = (str) -> {
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }

            return result;
        };

        System.out.println("String reverse: " + stringOp(reverse, inStr));

    }

}
