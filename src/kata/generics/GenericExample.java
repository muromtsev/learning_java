package kata.generics;

import java.util.*;

public class GenericExample {

    static class Animal { void feed() {
        System.out.println("Feed");
    } }
    static class Pet extends Animal { void call() {
        System.out.println("Call");
    } }
    static class Kitty extends Pet { void mew()  {
        System.out.println("Mew");
    } }
    static class Doge extends Pet { void bark() {
        System.out.println("Gaf");
    } }

    public static void main(String[] args) {
        Kitty cat1 = new Kitty();
        Kitty cat2 = new Kitty();
        Kitty cat3 = new Kitty();
        Doge dog1 = new Doge();
        Doge dog2 = new Doge();
        Doge dog3 = new Doge();
        List<Kitty> src = Arrays.asList(cat1, cat2, cat3);
        List<Pet> dest = new ArrayList<Pet>();



        for (Pet p: dest) p.call();
    }

}
