package net.turtton.koltinlove.nullsafe

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class NullSafeTest {

    @Test
    fun checkNullSafe() {
        var exception: NullPointerException? = null
        try {
            NullSafe().clearList(null)
        } catch (e: NullPointerException) {
            e.printStackTrace()
            exception = e;
        }
        assertNull(exception)
    }
}