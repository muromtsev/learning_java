package kata;


public class TestModule2 {

    public static class Cat {

        public void sayHello() {
            System.out.println("Мяу!");
        }

    }

    public static class Dog {

        public void sayHello() {
            System.out.println("Гав!");
        }

        public void catchCat(Cat cat) {
            System.out.println("Кошка поймана");
            sayHello();
            cat.sayHello();

        }
    }

    public static void main(String[] args) {

    }



}
