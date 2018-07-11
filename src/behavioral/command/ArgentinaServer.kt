package behavioral.command

class ArgentinaServer : IServer {
    override fun turnOff() {
        println("Apagando el servidor de Argentina")
    }

    override fun turnOn() {
        println("Prendiendo el servidor de Argentina")
    }

    override fun connect() {
        println("Conectando al servidor de Argentina")
    }

    override fun checkConnection() {
        println("Verificando conexion con el servidor de Argentina")
    }

    override fun storeLog() {
        println("Guardando log")
    }

    override fun disconnect() {
        println("Cerrando conexion con el servidor de Argentina")
    }

}