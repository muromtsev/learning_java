package kata.generics;

public class SimpleGen<T> {
    T ob;

    SimpleGen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Типом Т является " + ob.getClass().getName());
    }

    public static void main(String[] args) {
        SimpleGen<Integer> iOb = new SimpleGen<>(88);

        iOb.showType();

        int val = iOb.getOb();
        System.out.println("Value " + val);
        System.out.println();

        SimpleGen<String> strOb = new SimpleGen<>("Message");
        strOb.showType();

        String str = strOb.getOb();
        System.out.println("String " + str);


    }
}
