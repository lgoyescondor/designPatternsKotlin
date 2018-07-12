package behavioral.observer

class Administration : IBadState {
    override fun update() {
        println("Adminstracion: ")
        println("Envio una queja formal...")
    }
}