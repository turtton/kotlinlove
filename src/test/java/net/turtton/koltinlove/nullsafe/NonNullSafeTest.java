package net.turtton.koltinlove.nullsafe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonNullSafeTest {

    @Test
    void throwNullPointer() {
        NullPointerException exception = null;
        try {
            NonNullSafe.cleanList(null);
        } catch (NullPointerException e) {
            e.printStackTrace();
            exception = e;
        }
        assert exception != null;
    }
}