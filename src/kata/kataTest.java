package kata;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class kataTest {

    public static void main(String[] args) {
        String [] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич", "Лука"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        System.out.println(printTextPerRole(roles, textLines));;
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < roles.length; i++) {
            result.append(roles[i] + ":" + "\n");
//            System.out.println(roles[i] + ":");

            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i] + ":")) {
                    StringBuilder sb = new StringBuilder(textLines[j]);
                    StringBuilder sub = new StringBuilder(sb.substring(roles[i].length())).replace(0, 1, "");
                    result.append((j + 1) + ")" + sub + "\n");
                }

            }

            result.append("\n");

        }
        return new String(result);
    }


    public static boolean isGmailOrOutlook(String email) {

        Pattern pattern = Pattern.compile("[a-zA-Z0-9]{1,}@(gmail.com|outlook.com)");
        Matcher matcher = pattern.matcher(email);
        boolean found = matcher.matches();

        return (found) ? true : false;

    }
}
