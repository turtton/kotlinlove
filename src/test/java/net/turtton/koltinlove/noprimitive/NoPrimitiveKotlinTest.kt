package net.turtton.koltinlove.noprimitive

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class NoPrimitiveKotlinTest {

    @Test
    fun oneToString() {
        val one = NoPrimitiveKotlin().oneToString()
        assertEquals(one, "1")
    }
}