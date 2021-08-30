package rsk

import java.math.BigInteger

fun main() {
    println(fib(10, BigInteger("1"), BigInteger("0")))
    println(fib(500, BigInteger("1"), BigInteger("0")))
    println(fib(10000, BigInteger("1"), BigInteger("0")))
}

tailrec fun fib(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) b else fib(n - 1, a + b, a)
}
