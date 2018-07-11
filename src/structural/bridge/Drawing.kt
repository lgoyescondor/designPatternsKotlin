package structural.bridge

abstract class Drawing {
    abstract fun drawRectangle( x1 : Double,
                                y1 : Double,
                                x2 : Double,
                                y2 : Double)
    abstract fun drawCircle( x : Double,
                             y : Double,
                             r : Double
    )
}