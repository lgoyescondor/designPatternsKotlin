package structural.bridge

class Rectangle( var x1 : Double,
                 var y1 : Double,
                 var x2 : Double,
                 var y2 : Double,
                 override var drawing: Drawing) :
        Form( drawing ){
    override fun draw(){
        drawRectangle( x1,
                y1,
                x2,
                y2)
    }
}