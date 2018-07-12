package behavioral.visitor

class ProductoNormal(
        var precio : Double
) : Visitable {
    override fun accept(visitor:Visitor) : Double {
        return visitor.visit( this )
    }
}