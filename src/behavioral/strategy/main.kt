package behavioral.strategy

fun main(args: Array<String>) {
    val partner = Partner( "David", "Goyes", 1200.0 )
    val book = BookFinder().findBook( partner, "cualquier titulo")
    println( book.state )
}