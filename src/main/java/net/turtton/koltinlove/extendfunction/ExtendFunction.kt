package net.turtton.koltinlove.extendfunction

class ExtendFunction {
    fun Int.plusOne(): Int {
        return this + 1
    }

    fun plusOne(): Int {
        return 1.plusOne()
    }
}