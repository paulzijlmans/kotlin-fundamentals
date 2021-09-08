package rsk

fun main() {
    val program = Program()
//    program.fibonacci(8)
//    program.fibonacci(8, object : Process {
//        override fun execute(value: Int) {
//            println(value)
//        }
//
//    })
//    program.fibonacci(8, { n -> println(n) })
//    program.fibonacci(8, { println(it) })
//    program.fibonacci(8) { n -> println(n) }
//    program.fibonacci(8) { println(it) }
//    program.fibonacci(8, ::println)

    var total = 0
    program.fibonacci(8) { total += it }
    println(total)
}

interface Process {
    fun execute(value: Int)
}

class Program {
    fun fibonacci(limit: Int, action: (Int) -> Unit) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit) {
            action(current)

            val temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }

    fun fibonacci(limit: Int, action: Process) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit) {
            action.execute(current)

            val temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }

    fun fibonacci(limit: Int) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit) {
            println(current)

            val temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }
}