package net.turtton.koltinlove.delegate

class Delegation {
    class CustomList<T>(val list: List<T>) : List<T> by list {
        override fun get(index: Int): T {
            val result = list[index]
            println(result)
            return result
        }
    }
}
