package structural.bridge

class NormalDrawing : Drawing() {
    override fun drawRectangle(x1: Double, y1: Double, x2: Double, y2: Double) {
        println("Drawing a rectangle normally...")
    }

    override fun drawCircle(x: Double, y: Double, r: Double) {
        println("Drawing a circle normally...")
    }
}