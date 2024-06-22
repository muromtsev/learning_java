package p1;

class Derived extends Protection {
    Derived() {
        System.out.println("Derived конструктор");
        System.out.println("n = " + n);
        //Только класс
        //System.out.println("n_private = " + n_private);
        System.out.println("n_protected = " + n_protected);
        System.out.println("n_public = " + n_public);
    }
}
