package rsk

fun main() {
    val names = listOf("Kevin")

    printType(names)
    printType(listOf(1))
}

fun printType(items: List<Any>) {
    val stuff = items as List<String>

    stuff.filter { s -> s == "" }
}