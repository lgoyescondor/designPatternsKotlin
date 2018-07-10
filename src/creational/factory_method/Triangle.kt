package creational.factory_method

abstract class Triangle (
        open val sideA : Int,
        open val sideB : Int,
        open val sideC : Int
){
    abstract fun getDescription() : String
    abstract fun getSurface() : Double
    abstract fun draw()
}