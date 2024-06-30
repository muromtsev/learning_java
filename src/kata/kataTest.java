package kata;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class kataTest {

    public static void main(String[] args) {



    }



//    public static boolean isWeekend(String dayName) {
//        return (dayName.equals("Saturday") || (dayName.equals("Sunday")))
//                ? true
//                : false;
//    }
//
//    public static int weekendCount(String[] days) {
//        int count = 0;
//
//        for (String day : days) {
//            if (isWeekend(day)) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static int weekdayCount(String[] days) {
//        return days.length - weekendCount(days);
//    }




//    public static String printTextPerRole(String[] roles, String[] textLines) {
//        StringBuilder result = new StringBuilder();
//
//        for (int i = 0; i < roles.length; i++) {
//            result.append(roles[i] + ":" + "\n");
////            System.out.println(roles[i] + ":");
//
//            for (int j = 0; j < textLines.length; j++) {
//                if (textLines[j].startsWith(roles[i] + ":")) {
//                    StringBuilder sb = new StringBuilder(textLines[j]);
//                    StringBuilder sub = new StringBuilder(sb.substring(roles[i].length())).replace(0, 1, "");
//                    result.append((j + 1) + ")" + sub + "\n");
//                }
//
//            }
//
//            result.append("\n");
//
//        }
//        return new String(result);
//    }


//    public static boolean isGmailOrOutlook(String email) {
//
//        Pattern pattern = Pattern.compile("[a-zA-Z0-9]{1,}@(gmail.com|outlook.com)");
//        Matcher matcher = pattern.matcher(email);
//        boolean found = matcher.matches();
//
//        return (found) ? true : false;
//
//    }
}
