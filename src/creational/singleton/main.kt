package creational.singleton

fun main(args: Array<String>) {
    var first = Singleton
    first.b = "Have already created singleton"

    var second = Singleton
    println( second.b )
}