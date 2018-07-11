package behavioral.command

class ResetServer(
        private val server : IServer
): Command {
    override fun execute() {
        server.connect()
        server.checkConnection()
        server.storeLog()
        server.turnOff()
        server.turnOn()
        server.storeLog()
        server.disconnect()
    }
}