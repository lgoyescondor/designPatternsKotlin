package creational.factory_method

class TriangleFactory : ITriangleFactoryMethod {
    override fun createTriangle(sideA: Int, sideB: Int, sideC: Int): Triangle {
        if ((sideA == sideB) && (sideA==sideC)){
            return Equilateral(sideA, sideB, sideC)
        } else if ((sideA != sideB) && (sideA != sideC) && (sideB != sideC)){
            return Scalene( sideA, sideB, sideC )
        } else {
            return Isosceles( sideA, sideB, sideC )
        }
    }
}