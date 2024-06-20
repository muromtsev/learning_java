package net.mindview.util;
import java.io.*;

//: net/mindview/util/net.mindview.util.Print.java
// Методы печати, которые могут использоваться
// без спецификаторов благодаря конструкции
// Java SE5 static import

public class Print {
    // печать с переводом строки
    public static void print(Object obj) {
        System.out.println(obj);
    }
    // перевод строки
    public static void print() {
        System.out.println();
    }
    // без перевода строки
    public static void printnb(Object obj) {
        System.out.print(obj);
    }
    // printf из языка C
    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}