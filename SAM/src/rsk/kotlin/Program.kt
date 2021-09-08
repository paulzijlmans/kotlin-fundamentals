package rsk.kotlin

import rsk.java.Created
import rsk.java.User

fun main() {
    val user = User("Kevin")

    var count = 0
    val eventListener = Created { println("User $it has been created: ${++count} times") }

    user.create { println("User $it has been created: ${++count} times") }
    user.create { println("User $it has been created: ${++count} times") }
    user.create(eventListener)
}