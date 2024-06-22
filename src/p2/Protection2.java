package p2;

class Protection2 extends p1.Protection {
    Protection2() {
        System.out.println("Protection2 конструктор");
        // Только класс или пакет
        //System.out.println("n = " + n);
        // Только класс
        //System.out.println("n_private = " + n_private);
        System.out.println("n_protected = " + n_protected);
        System.out.println("n_public = " + n_public);
    }


}
