package structural.decorator

class FiatOne : Car() {
    override fun getDescription(): String {
        return "Fiat One model 2006"
    }

    override fun getPrice(): Int {
        return 15000
    }
}