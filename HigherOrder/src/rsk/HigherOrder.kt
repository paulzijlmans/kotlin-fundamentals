package rsk

val action = { println("Hello, World") }
val calc = { x: Int, y: Int -> x * y }

fun main() {
    doSomething(action)
    doSomething { calc(1, 4) }
}

fun doSomething(func: () -> Unit) {
    func()
}