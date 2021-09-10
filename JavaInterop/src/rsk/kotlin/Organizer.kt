package rsk.kotlin

import rsk.java.Address
import rsk.java.Meeting

fun main() {
    val m = Meeting()

    m.addTitle("Title")
//    m.addTitle(null)

    val title: String? = m.meetingTitle()

    println(title)

    val m2 = Meeting()
    val title2: String = m2.titleCanBeNull() ?: "nobody"
    println(title2)
}

class HomeAddress : Address {
    override fun getFirstAddress(): String {
        return ""
    }
}

class WorkAddress : Address {
    override fun getFirstAddress(): String? {
        return ""
    }

}