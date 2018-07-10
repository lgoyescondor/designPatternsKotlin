package creational.factory_method

class Isosceles(
        override val sideA : Int,
        override val sideB : Int,
        override val sideC : Int
) : Triangle( sideA, sideB, sideC ){
    override fun getDescription(): String {
        return "I'm an isosceles triangle"
    }

    override fun getSurface(): Double {
        return 0.0
    }

    override fun draw() {
        // The triangle draws itself
    }
}