package net.turtton.koltinlove.noimplicit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplicitTypeConvTest {

    @Test
    void doubleTypeZero() {
        var zero = ImplicitTypeConv.doubleTypeZero();
        assert zero == 0;
    }
}