package behavioral.command

class USAServer : IServer {
    override fun turnOff() {
        println("Apagando el servidor de USA")
    }

    override fun turnOn() {
        println("Prendiendo el servidor de USA")
    }

    override fun connect() {
        println("Conectando al servidor de USA")
    }

    override fun checkConnection() {
        println("Verificando conexion con el servidor de USA")
    }

    override fun storeLog() {
        println("Guardando log")
    }

    override fun disconnect() {
        println("Cerrando conexion con el servidor de USA")
    }

}