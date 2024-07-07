package kata.generics;

public class Account<T> implements Accountable<T> {

    private T id;
    private int sum;
    String[] currency = { "Dollar", "Ien", "Ruble" };
    Integer[] money = { 100, 12, 1 };

    Account(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }

    public static <T> void print(T[] currency) {
        for (T c : currency) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        Accountable<String> acc1 = new Account("$2334", 5000);
        String acc1Id = acc1.getId();
        System.out.println(acc1Id);

        Account acc2 = new Account(2334.00, 5000);

        System.out.println(acc2.getId());
        System.out.println();

        print(acc2.currency);
        print(acc2.money);
    }
}

interface Accountable<T> {
    T getId();
    int getSum();
    void setSum(int sum);
}
