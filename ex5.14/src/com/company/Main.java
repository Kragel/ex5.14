/*Create a class with a static String field that is initialized at the point of
definition, and another one that is initialized by the static block. Add a static method that
prints both fields and demonstrates that they are both initialized before they are used. */
package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("выбирай");
        Go.how();
        System.out.println("s1: " + Go.s1);
    }
    static Go g1 = new Go();
    static Go g2 = new Go();
}
