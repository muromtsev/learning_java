package kata;

import java.util.HashSet;
import java.util.Set;

public class kata_5_2_13 {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        HashSet<T> st1 = new HashSet<>();
        HashSet<T> st2 = new HashSet<>();

        st1.addAll(set1);
        st2.addAll(set2);

        st1.removeAll(set2);
        st2.removeAll(set1);
        st1.addAll(st2);

        return st1;
    }

    public static void main(String[] args) {

        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);

        HashSet<Integer> s2 = new HashSet<>();
        s2.add(0);
        s2.add(1);
        s2.add(2);

        Set<Integer> result = symmetricDifference(s1, s2);
        System.out.println(result);

    }
}
