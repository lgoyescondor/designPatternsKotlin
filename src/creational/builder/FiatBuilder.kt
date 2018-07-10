package creational.builder

class FiatBuilder(override var year : Int,
                  var serialNumber : Long,
                  var horsePower : Int) :
        Car.Builder( 4, year, "Fiat", Engine(serialNumber, horsePower)) {

    /*override fun buildEngine() {
        engine = Engine(serialNumber, horsePower)
    }

    override fun buildBrand() {
        brand = "Fiat"
    }

    override fun buildYear() {
        this.year = year
    }

    override fun buildNumberDoors() {
        this.numberDoors = 4
    }*/
}