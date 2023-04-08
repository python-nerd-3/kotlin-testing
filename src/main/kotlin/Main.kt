@file:Suppress("USELESS_IS_CHECK")

fun sumIsNegative(a: Int, b: Int) {
    val sum: Int = a + b
    if (sum >= 0) {
        println("Sum is positive")
    } else {
        println("Sum is negative")
    }
}

fun sumNegativeBetter(a: Int, b: Int): Boolean {
    return a + b <= 0
}

fun fistbug(amt: Int) {
    for (i in 1..amt) {
        var string = ""
        if (i % 3 == 0) {
            string += "fist"
        }
        if (i % 5 == 0) {
            string += "bug"
        }
        println("$i: $string")
    }
}

fun one() = 1

fun main() {
    val hello: String = "Hello World!"
    println(hello)
    sumIsNegative(1, 2)
    println(hello is String)
    for (i in 1..10) {
        println(i)
    }
    println("")
    println(one())
    fistbug(100)
    println(sumNegativeBetter(5, -6))
    // kotlin is not like other languages when it comes to arrays
    var arr: Array<Int> = Array(5) { i -> i }
    arr.forEach {println(it)}
}