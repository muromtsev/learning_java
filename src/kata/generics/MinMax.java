package kata.generics;

public interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}

class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;

    MyClass(T[] o) {
        vals = o;
    }

    @Override
    public T min() {
        T v = vals[0];

        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0) {
                v = vals[i];
            }
        }
        return v;
    }

    @Override
    public T max() {
        T v = vals[0];

        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }
        return v;
    }
}

class GenIFDemo {
    public static void main(String[] args) {
        Integer[] inums = { 3, 5, 2, 6, 8 };
        Character[] chs = { 'b', 'r', 'p', 'w' };

        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> cob = new MyClass<>(chs);

        System.out.println("Max inums: " + iob.max());
        System.out.println("Min inums: " + iob.min());

        System.out.println("Max chs: " + cob.max());
        System.out.println("Min chs: " + cob.min());
    }
}
