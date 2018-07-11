package structural.bridge

abstract class Form (open var drawing : Drawing ) {
    abstract fun draw()

    fun drawRectangle( x1 : Double,
                       y1 : Double,
                       x2 : Double,
                       y2 : Double ){
        drawing.drawRectangle( x1,
                y1,
                x2,
                y2)
    }

    fun drawCircle( x : Double,
                    y : Double,
                    r : Double
    ){
        drawing.drawCircle( x,
                y,
                r
        )
    }
}