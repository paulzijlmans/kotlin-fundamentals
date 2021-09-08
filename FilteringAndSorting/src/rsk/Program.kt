package rsk

fun main() {
    val ints = listOf(1, 2, 3, 4, 5)

    val smallInts = ints.filter { it < 4 }
    println("smallInts:")
    for (i: Int in smallInts) println(i)

    val squaredInts = ints.map { it * it }
    println("squaredInts:")
    for (i: Int in squaredInts) println(i)

    val smallSquaredInts = ints
        .filter { it < 5 }
        .map { it * it }
    println("smallSquaredInts:")
    for (i: Int in smallSquaredInts) println(i)

    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"))
    val titles: List<String> = meetings
        .filter { it.title.startsWith("C") }
        .map { m -> m.title }
    println("titles:")
    for (t in titles) println(t)
}