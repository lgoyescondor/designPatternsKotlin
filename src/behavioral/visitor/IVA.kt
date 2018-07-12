package behavioral.visitor

class IVA : Visitor {
    override fun visit(normal: ProductoNormal) : Double = normal.precio * impuestoNormal

    override fun visit(reducido: ProductoDescuento) : Double = reducido.precio * impuestoReducido

    private val impuestoNormal : Double = 1.21
    private val impuestoReducido : Double = 1.105


}