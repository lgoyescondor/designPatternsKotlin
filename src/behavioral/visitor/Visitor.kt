package behavioral.visitor

interface Visitor {
    fun visit( normal : ProductoNormal ) : Double
    fun visit( reducido : ProductoDescuento ) : Double
}