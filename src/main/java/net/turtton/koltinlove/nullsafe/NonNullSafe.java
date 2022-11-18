package net.turtton.koltinlove.nullsafe;

import java.util.List;

public class NonNullSafe {
    public static void cleanList(List<?> value) {
        value.clear();
    }
}
