package behavioral.observer

class Purchasing : IBadState{
    override fun update() {
        println("Compras: ")
        println("Solicito nueva cotizacion")
    }
}