package kata.generics;

public class Program {

    public static void main(String[] args) {

        Account2 ac1 = new Account2("1896", 4500);
        Account2 ac2 = new Account2("3476", 1500);

        Transaction<Account2> tr1 = new Transaction<Account2>(ac1, ac2, 4000);
        tr1.execute();
        tr1 = new Transaction<Account2>(ac1, ac2, 4000);
        tr1.execute();

    }
}

class Transaction<T extends Account2> {

    private T from; // с какоого счета перевод
    private T to;   // на какой счет перевод
    private int sum; // сумма перевода

    Transaction(T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    public void execute() {
        if (from.getSum() > sum) {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.printf("Account %s: %d \nAccount %s: %d \n",
                    from.getId(), from.getSum(), to.getId(), to.getSum());
        } else {
            System.out.printf("Operation is invalid");
        }
    }
}

class Account2 {
    private String id;
    private int sum;

    Account2(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}