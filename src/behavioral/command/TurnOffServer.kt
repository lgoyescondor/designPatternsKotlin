package behavioral.command

class TurnOffServer(
        private val server : IServer
): Command {
    override fun execute() {
        server.connect()
        server.checkConnection()
        server.storeLog()
        server.turnOff()
        server.disconnect()
    }
}