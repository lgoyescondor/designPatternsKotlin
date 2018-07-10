package creational.factory_method

interface ITriangleFactoryMethod {
    fun createTriangle(
            sideA : Int,
            sideB : Int,
            sideC : Int
    ) : Triangle
}