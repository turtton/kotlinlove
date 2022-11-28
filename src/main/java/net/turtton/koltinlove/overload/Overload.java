package net.turtton.koltinlove.overload;

public class Overload {

    public static void greet() {
        greet("Java");
    }

    public static void greet(String name) {
        greet(name, 20);
    }

    public static void greet(String name, int age) {
        System.out.println("Hello! I'm " + name + ". I'm " + age);
    }

    public static void call() {
        greet();
        greet("Caller");
        greet("Caller2", 21);
    }
}
