@file:JvmName("DisplayFunctions")

package rsk

private const val MESSAGE = "Hello, World"

fun main() {
    display(MESSAGE)

    println(max(1, 2))

    log(MESSAGE, 2)
    log(message = MESSAGE, 2)
    log(message = MESSAGE, logLevel = 2)
    log(logLevel = 2, message = MESSAGE)
    log(message = MESSAGE)

    val text = "With     multiple \t whitespace"
    println(text)
    println(replaceMultipleWhiteSpace(text))
    println(text.replaceMultipleWhiteSpaceEx())
}

fun display(message: String): Boolean {
    println(message)
    return true
}

fun max(a: Int, b: Int): Int = if (a > b) a else b

@JvmOverloads
fun log(message: String, logLevel: Int = 1) {
    println(message + logLevel)
}

fun replaceMultipleWhiteSpace(value: String) : String {
    val regex = Regex("\\s+")
    return regex.replace(value, " ")
}

fun String.replaceMultipleWhiteSpaceEx() : String {
    val regex = Regex("\\s+")
    return regex.replace(this, " ")
}
