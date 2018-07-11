package structural.bridge

class DottedDrawing : Drawing() {
    override fun drawRectangle(x1: Double, y1: Double, x2: Double, y2: Double) {
        println("Drawing a rectangle with dots...")
    }

    override fun drawCircle(x: Double, y: Double, r: Double) {
        println("Drawing a circle with dots...")
    }
}