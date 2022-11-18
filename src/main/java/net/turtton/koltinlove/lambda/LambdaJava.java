package net.turtton.koltinlove.lambda;

import java.util.function.Function;

public class LambdaJava {
    public static void printProcessedZero(Function<Integer, Integer> function) {
        var result = function.apply(0);
        System.out.println("Processed to " + result);
    }

    public static void call() {
        printProcessedZero(i -> {
            System.out.println("Original is " + i);
            return i + 1;
        });
    }
}
