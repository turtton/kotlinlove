package net.turtton.koltinlove.delegate

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DelegationTest {
    val customList = Delegation.CustomList(listOf("a", "b", "c"))

    @Test
    fun get() {
        val a = customList[0]
        assertEquals(a, "a")
        val b = customList[1]
        assertEquals(b, "b")
        val c = customList[2]
        assertEquals(c, "c")
    }

}