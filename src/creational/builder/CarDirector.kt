package creational.builder

class CarDirector {
    private lateinit var carBuilder : Car.Builder

    fun setCarBuilder( carBuilder : Car.Builder ) {
        this.carBuilder = carBuilder
    }

    fun buildCar(){
        carBuilder.createCar()
        /*carBuilder.buildBrand()
        carBuilder.buildYear()
        carBuilder.buildEngine()
        carBuilder.buildNumberDoors()*/
    }

    fun getCar() : Car{
        return carBuilder.getCar()
    }
}