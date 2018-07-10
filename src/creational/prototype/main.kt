package creational.prototype

fun main(args: Array<String>) {
    var plasma : Plasma = Plasma(
            "Sony",
            21,
            "Plateado",
            399.99,
            90.0,
            0.05
    )
    var lcd : LCD = LCD(
            "Panasonic",
            42,
            "Plateado",
            599.99,
            290.0
    )
    var tvp : TvPrototype = TvPrototype()
    tvp.addPrototype("Plasma", plasma)
    tvp.addPrototype("LCD", lcd)

    var tv : TV = tvp.getPrototype("Plasma") as TV

    println( tv.price )
}