package holding;
import java.util.*;

public class SimpleCollection {
    public static void main(String[] args) {
        HashSet<Integer> c = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        for(Integer i : c) {
            System.out.print(i + ", ");
        }
    }
}
