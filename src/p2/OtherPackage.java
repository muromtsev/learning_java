package p2;

class OtherPackage {
    OtherPackage() {
        p1.Protection p = new p1.Protection();
        System.out.println("OtherPackage конструктор");
        // Только класс или пакет
        //System.out.println("n = " + n);
        // Только класс
        //System.out.println("n_private = " + n_private);
        // Только класс, подкласс или пакет
        //System.out.println("n_protected = " + n_protected);
        System.out.println("n_public = " + p.n_public);

    }
}
