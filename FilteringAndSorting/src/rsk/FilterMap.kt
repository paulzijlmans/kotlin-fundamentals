package rsk

import java.util.*

fun iter(seq:Sequence<String>) {
    for(t in seq) println(t)
}

fun main() {
    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"))

    val titles = meetings
        .asSequence()
        .filter { it.title.startsWith("C") }
        .map { m -> m.title }
    println("titles:")
    for (t in titles) println(t)

    val title = meetings
        .asSequence()
        .map { it.title.uppercase(Locale.getDefault()) }
        .find { it.startsWith("BOARD") }
    println("title $title")

    println("iter:")
    iter(titles)

}