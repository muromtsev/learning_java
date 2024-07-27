package kata.generics;

public class Stats<T extends Number> {
    T[] nums;

    Stats(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    boolean isSameAvg(Stats<?> ob) {
        return (average() == ob.average());
    }

    public static void main(String[] args) {
        Integer[] inums = { 1, 2, 3, 4, 5 };
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("avg int nums " + v);

        Double[] dnums = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Stats<Double> dob = new Stats<>(dnums);
        double d = dob.average();
        System.out.println("avg double nums " + d);

        boolean a = iob.isSameAvg(dob);
        System.out.println(a);
    }
}
