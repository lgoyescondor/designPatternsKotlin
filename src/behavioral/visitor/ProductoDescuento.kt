package behavioral.visitor

class ProductoDescuento(
        var precio : Double
) : Visitable {
    override fun accept(visitor:Visitor) : Double {
        return visitor.visit( this )
    }
}