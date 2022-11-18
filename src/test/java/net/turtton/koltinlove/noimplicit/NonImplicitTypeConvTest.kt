package net.turtton.koltinlove.noimplicit

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class NonImplicitTypeConvTest {

    @Test
    fun doubleTypeZero() {
        val zero = NonImplicitTypeConv().doubleTypeZero()
        assertEquals(zero, 0.0)
    }
}