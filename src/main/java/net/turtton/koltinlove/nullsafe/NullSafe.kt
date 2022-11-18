package net.turtton.koltinlove.nullsafe

class NullSafe {
    fun clearList(value: MutableList<*>?) {
        value?.clear()
    }
}