package structural.decorator

/**
 * It is necessary to extend the functionality of a class,
 * but is not necessary to extend it through hierarchy
 */
fun main(args: Array<String>) {
    var car : Accessory = FiatOne()
    car = CDPlayer( car )
    car = Gasoil( car )

    println( car.getDescription() )
    println( "It costs ${car.getPrice()}" )

    var car2 : Accessory = FordFiesta()
    car2 = MP3Player( car2 )
    car2 = Gasoil( car2 )
    car2 = AirConditioner( car2 )

    println( car2.getDescription() )
    println( "It costs ${car2.getPrice()}" )
}