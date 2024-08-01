package kata;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class kata_5_2_15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Deque<Integer> dal = new ArrayDeque<>();

        while (scan.hasNextInt()) {
            scan.next();

            if (scan.hasNextInt()) {
                dal.addFirst(scan.nextInt());
            }
        }

        for (Integer i : dal ) {
            System.out.print(i + " ");
        }

    }
}
