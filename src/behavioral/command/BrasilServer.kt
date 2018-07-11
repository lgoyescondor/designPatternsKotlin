package behavioral.command

class BrasilServer : IServer {
    override fun turnOff() {
        println("Apagando el servidor de Brasil")
    }

    override fun turnOn() {
        println("Prendiendo el servidor de Brasil")
    }

    override fun connect() {
        println("Conectando al servidor de Brasil")
    }

    override fun checkConnection() {
        println("Verificando conexion con el servidor de Brasil")
    }

    override fun storeLog() {
        println("Guardando log")
    }

    override fun disconnect() {
        println("Cerrando conexion con el servidor de Brasil")
    }

}