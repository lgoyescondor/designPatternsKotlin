package structural.decorator

class FordFiesta : Car() {
    override fun getDescription(): String {
        var cd : AirConditioner()



        return "Ford Fiesta model 2008"
    }

    override fun getPrice(): Int {
        return 25000
    }
}