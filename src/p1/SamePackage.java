package p1;

class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("SamePackage конструктор");
        System.out.println("n = " + p.n);
        // Только класс
        //System.out.println("n_private = " + n_private);
        System.out.println("n_protected = " + p.n_protected);
        System.out.println("n_public = " + p.n_public);
    }
}
