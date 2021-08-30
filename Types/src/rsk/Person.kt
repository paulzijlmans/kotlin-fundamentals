package rsk

fun main() {
    val kevin = Student("Kevin", "Jones", 1)
    println(kevin.id)
    println(kevin.tutor)
    val john = Student("John", "Williams", 2, "Some tutor")
    println(john.id)
    println(john.tutor)
}

abstract class Person(private var firstName: String, private var lastName: String) {

    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress(): String
}

class Student(firstName: String, lastName: String, _id: Int, var tutor: String = "") : Person(firstName, lastName) {
    val id: Int

    init {
        id = _id
    }

    override fun getName(): String {
        return ""
    }

    override fun getAddress(): String {
        return ""
    }
}
