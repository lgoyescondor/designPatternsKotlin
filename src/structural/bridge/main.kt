package structural.bridge

/**
 * Detaches an interface from its implementation, in
 * a way that both can be modified independently without
 * modifying the other part.
 */
fun main(args: Array<String>) {
    var rectangle : Rectangle = Rectangle(1.0,
            1.0,
            2.0,
            2.0,
            DottedDrawing()
    )
    rectangle.draw()

    var circle : Circle = Circle(2.0,
            2.0,
            3.0,
            NormalDrawing()
    )
    circle.draw()
}