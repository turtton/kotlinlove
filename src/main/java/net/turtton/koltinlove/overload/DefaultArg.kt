package net.turtton.koltinlove.overload

class DefaultArg {
    fun greet(name: String = "Kotlin", age: Int = 20) {
        println("Hello! I'm $name. I'm $age!")
    }

    fun call() {
        greet()
        greet("Caller")
        greet("Caller2", 30)
        greet(age = 11)
    }
}