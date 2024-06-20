package holding;

import java.util.ArrayList;

class Gerbil {
    static int gerbilNumber = 0;

    Gerbil() {
        gerbilNumber++;
    }

    public static String hop() {
        return "gerbilNumber " + gerbilNumber;
    }

    public static void main(String[] args) {
        ArrayList g = new ArrayList();

        for (int i = 0; i < 3; i++) {
            g.add(new Gerbil());
        }

        for (int i = 0; i < g.size(); i++) {
            System.out.println(((Gerbil)g.get(i)).hop());
        }
    }
}

