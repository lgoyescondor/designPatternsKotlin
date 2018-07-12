package behavioral.observer

class Stock : IBadState {
    override fun update() {
        println("Stock:")
        println("Le doy de baja")
    }
}