package rsk.kotlin

import rsk.java.Meeting
import rsk.java.Organizer

fun main() {
    val people: List<Person?>?

    people = listOf(Person(23), Person(23), null)

    for(person in people) {
        println(person?.age)
    }

    val people2: MutableList<Person?>?

    people2 = mutableListOf(Person(25), Person(25))

    people2.add(null)

    for (person in people2.filterNotNull()) {
        println(person.age)
    }
}

class Person(val age: Int): Organizer {
    override fun processMeetings(meetings: MutableList<Meeting>?) {

    }

}