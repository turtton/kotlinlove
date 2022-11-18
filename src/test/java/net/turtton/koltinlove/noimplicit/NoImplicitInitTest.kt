package net.turtton.koltinlove.noimplicit

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class NoImplicitInitTest {

    val noImplicitInit = NoImplicitInit()

    @Test
    fun getNumber() {
        assertEquals(noImplicitInit.number, 0)
    }

    @Test
    fun getBool() {
        assertEquals(noImplicitInit.bool, false)
    }

    @Test
    fun getStr() {
        assertEquals(noImplicitInit.str, "")
    }
}