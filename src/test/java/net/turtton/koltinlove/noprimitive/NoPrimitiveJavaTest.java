package net.turtton.koltinlove.noprimitive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoPrimitiveJavaTest {

    @Test
    void oneToString() {
        var one = NoPrimitiveJava.oneToString();
        assert one.equals("1");
    }

    @Test
    void wtfInteger() {
        NoPrimitiveJava.wtfInteger();
    }
}