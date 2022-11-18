package net.turtton.koltinlove.collection;

import java.util.ArrayList;

public class CollectionWithStream {
    public static void stream() {
        var list = new ArrayList<Integer>();
        list.add(1);
        list.add(8);
        list.add(5);
        list.add(3);
        list.stream()
                .filter(i -> i % 2 != 0)
                .sorted()
                .map(i -> "Number:" + i)
                .forEach(System.out::println);
    }
}
