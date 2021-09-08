package rsk

fun main() {
    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"))

    val peopleList: List<List<Person>> = meetings
        .map(Meeting::people)
    println("peopleList:")
    for (list in peopleList) {
        for (p in list) println(p.name)
    }

    val people: List<Person> = meetings
        .flatMap(Meeting::people)
        .distinct()
    println("people:")
    for (p in people) println(p.name)
}