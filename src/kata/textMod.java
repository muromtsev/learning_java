package kata;

import java.util.ArrayList;

public class textMod {
    public static void textModifier() {
//        Scanner scan = new Scanner(System.in);
//        String[] arr = scan.nextLine().split(" ");
        String str = "генрих1  играет+2   л-июбит0школу";
        System.out.println("[IN]: " + str);
        String[] arr = str.split(" ");
        String res = deleteSpace(arr);
        StringBuilder result = deleteMinus(new StringBuilder(res), "-");
        String s = new String(result).replace("+", "!");
        System.out.println("[OUT] " + getSum(s));
    }

    public static void main(String[] args) {
        textModifier();
    }

    public static StringBuilder getSum(String string) {
        int total = 0;
        StringBuilder sb = new StringBuilder(string);

        for (int i = 0; i < sb.length(); i++) {
            if(Character.isDigit(sb.charAt(i))) {
                total += Integer.parseInt(String.valueOf(sb.charAt(i)));
                sb.deleteCharAt(i);
            }
        }

        if(total != 0) sb.append(" ").append(total);

        return sb;
    }

    public static StringBuilder deleteMinus(StringBuilder s, String sign) {
        char[] chars = new char[3];
        int idx;
        String result;

        while((idx = s.indexOf(sign)) != -1) {
            s.getChars(idx-1, idx+2, chars, 0);
            s.delete(idx-1, idx+2);

            char[] ch = reverseChars(chars);

            result = new String(ch).replace(sign, "");

            s.insert(idx-1, result);
        }

        return s;
    }

    public static char[] reverseChars(char[] ch) {
        char[] c = new char[ch.length];
        for (int i = ch.length-1; i >= 0; i--) {
            c[ch.length - i - 1] = ch[i];
        }
        return c;
    }

    public static String deleteSpace(String[] arr) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : arr) {
            if (!s.isBlank()) {
                result.add(s.strip());
            }
        }
        return String.join(" ", result);
    }

}
