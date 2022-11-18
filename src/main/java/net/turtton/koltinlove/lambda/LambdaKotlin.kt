package net.turtton.koltinlove.lambda

class LambdaKotlin {
    fun printProcessZero(function: (Int) -> Int) {
        val result = function(0)
        println("Processed to $result")
    }

    fun call() {
        printProcessZero {
            println("Original is $it")
            it + 1
        }
    }
}