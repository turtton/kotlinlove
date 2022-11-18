package net.turtton.koltinlove.noprimitive;

public class NoPrimitiveJava {
    public static String oneToString() {
        return Integer.toString(1);
    }

    public static void wtfInteger() {
        Integer i = 127;
        Integer j = 127;
        System.out.println("i == j is " + (i == j));

        Integer k = 128;
        Integer l = 128;
        System.out.println("k == l is " + (k == l));
    }
}
