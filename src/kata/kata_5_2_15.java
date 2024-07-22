package kata;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class kata_5_2_15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Deque dal = new ArrayDeque();

        while (scan.hasNextInt()) {
            scan.next();

            if (scan.hasNextInt()) {
                dal.addFirst(scan.nextInt());
            }
        }

        Iterator iterator = dal.iterator();
        StringBuilder sb = new StringBuilder();

        while (iterator.hasNext()) {
            sb.append(iterator.next());
            sb.append(" ");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());

    }
}
