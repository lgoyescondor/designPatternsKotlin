package behavioral.visitor

fun main(args: Array<String>) {
    val product1 = ProductoDescuento( 100.0 )
    val product2 = ProductoNormal( 100.0 )

    val iva = IVA()

    println( product1.accept(iva) )
    println( product2.accept(iva) )

}