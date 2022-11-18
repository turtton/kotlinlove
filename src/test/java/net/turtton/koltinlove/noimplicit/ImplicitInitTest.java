package net.turtton.koltinlove.noimplicit;

import org.junit.jupiter.api.Test;

class ImplicitInitTest {

    ImplicitInit implicitInit = new ImplicitInit();

    @Test
    void checkValues() {
        assert implicitInit.number == 0;
        assert !implicitInit.bool;
        assert implicitInit.str == null;
    }

}