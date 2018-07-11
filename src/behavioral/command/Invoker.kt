package behavioral.command

class Invoker( private val command : Command ) {
    fun run() {
        command.execute()
    }
}