package structural.bridge

class Circle( val xCoordinate : Double,
              val yCoordinate : Double,
              val rCoordinate : Double,
              override var drawing: Drawing) :
        Form( drawing = drawing) {

    override fun draw() {
        drawCircle(xCoordinate,
                yCoordinate,
                rCoordinate)
    }
}