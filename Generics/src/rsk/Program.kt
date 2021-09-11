package rsk

fun main() {
    val names = listOf("Kevin", "Alex")

    val name = names.itemAt(0)
    println(name)

    val n: Node<Int> = Node(2)
    println(n.value())
}

fun <T> List<T>.itemAt(index: Int): T {
    return this[index]
}

class Node<T : Number>(private val item: T) {
    fun value(): T {
        return item
    }
}