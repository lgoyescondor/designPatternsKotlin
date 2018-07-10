package creational.builder

/*class Car(val model : String?, val year : Int){
    private constructor( builder:Builder ) : this(
            builder.model,
            builder.year)

    class Builder {
        var model:String? = null
            private set
        var year:Int = 0
            private set
        fun model( model: String ) = apply { this.model = model }
        fun year( year: Int ) = apply { this.year = year }
        fun build() = Car(this)
    }
}*/

class Car(
        private val numberDoors : Int,
        private val year : Int,
        private val brand : String,
        private val engine : Engine
){
    fun getNumberDoors() : Int {
        return numberDoors
    }
    fun getYear() : Int {
        return year
    }
    fun getBrand() : String {
        return brand
    }
    fun getEngine() : Engine {
        return engine
    }

    private constructor(builder:Builder) : this(
            builder.numberDoors,
            builder.year,
            builder.brand,
            builder.engine!!
    )

    open abstract class Builder (open var numberDoors : Int = 0,
                                 open var year : Int = 0,
                                 open var brand : String = "",
                                 open var engine : Engine? = null){

        private lateinit var car : Car

        fun createCar() {
            car = Car(this)
        }

        fun getCar() : Car{
            return car
        }

        /*abstract fun buildEngine()
        abstract fun buildBrand()
        abstract fun buildYear()
        abstract fun buildNumberDoors()*/
    }
}