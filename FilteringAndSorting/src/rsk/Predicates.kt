package rsk

fun main() {
    val ints = listOf(1, 2, 3, 4, 5)
    val greaterThanThree = { v: Int -> v > 3 }

    var largeInts = ints.all(greaterThanThree)
    println("all: $largeInts")

    largeInts = ints.any(greaterThanThree)
    println("any: $largeInts")

    val numberOfLargeInts = ints.count(greaterThanThree)
    println("number of large ints: $numberOfLargeInts")

    var found: Int? = ints.find(greaterThanThree)
    println("found: $found")

    found = ints.find { it > 6 }
    println("found: $found")
}