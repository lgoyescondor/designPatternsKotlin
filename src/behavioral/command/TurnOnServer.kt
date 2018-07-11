package behavioral.command

class TurnOnServer(
        private val server : IServer
): Command {
    override fun execute() {
        server.connect()
        server.checkConnection()
        server.storeLog()
        server.turnOn()
        server.disconnect()
    }
}