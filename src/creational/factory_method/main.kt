package creational.factory_method

/**
 * The responsibility of instantiating one of a set of classes,
 * relies on this factory method, instead of the developer
 */
fun main(args: Array<String>) {
    val factory = TriangleFactory()
    val triangle : Triangle = factory.createTriangle( 10, 10, 10)

    println( triangle.getDescription() )
}