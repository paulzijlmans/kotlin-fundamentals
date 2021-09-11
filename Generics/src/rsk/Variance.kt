package rsk

fun main() {
    val financialMeeting = mutableListOf(FinanceMeeting())
    val meetings: AllMeetings<FinanceMeeting> = AllMeetings(financialMeeting)

    attendAllMeetings(meetings)
}

class AllMeetings<out T : Meeting>(private val meetings: List<Meeting>) {
    val count: Int get() = meetings.count()

    operator fun get(i: Int) = meetings[i]
}

fun attendAllMeetings(meetings: AllMeetings<Meeting>) {
    for (i in 0 until meetings.count) {
        meetings[i].attend()
    }
}