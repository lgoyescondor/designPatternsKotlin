package creational.builder

fun main(args: Array<String>) {
    val director : CarDirector = CarDirector()

    director.setCarBuilder(
            FiatBuilder(
                    2018,
                    12346897,
                    40)
    )
    director.buildCar()
    var car : Car = director.getCar()

    println( car.getBrand() )
    println( car.getYear() )
}