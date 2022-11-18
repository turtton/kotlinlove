package net.turtton.koltinlove.dataclass

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BasicDataClassTest {

    val basicDataClass = BasicDataClass(1, "str", false)

    @Test
    fun getNum() {
        assertEquals(basicDataClass.num, 1)
    }

    @Test
    fun getStr() {
        assertEquals(basicDataClass.str, "str")
    }

    @Test
    fun getBool() {
        assertEquals(basicDataClass.bool, false)
    }
}
