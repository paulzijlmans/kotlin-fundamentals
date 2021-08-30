package rsk2

fun main() {
    val kevin = Student(1, "Kevin")
    val jones = Student(1, "Kevin")
    val another = Student(1, "Kevin Jones")

    println(kevin)

    if(kevin == jones) {
        println("Equal")
    } else {
        println("Not equal")
    }

    if(kevin == another) {
        println("Equal")
    } else {
        println("Not equal")
    }

    val newKevin = kevin.copy(name = "Robert")
    println(newKevin)
}

data class Student(val id: Int, val name: String)
