package net.turtton.koltinlove.extendfunction

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ExtendFunctionTest {

    @Test
    fun plusOne() {
        val one = ExtendFunction().plusOne()
        assertEquals(one, 1)
    }
}