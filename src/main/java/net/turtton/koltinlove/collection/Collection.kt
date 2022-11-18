package net.turtton.koltinlove.collection

class Collection {
    fun collection() {
        listOf(1, 8, 5, 3)
            .filter { it % 2 != 0 }
            .sorted()
            .map { "Number:$it" }
            .forEach(::println)
    }
}