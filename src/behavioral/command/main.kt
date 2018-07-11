package behavioral.command

fun main(args: Array<String>) {
    val command : Command = TurnOnServer( ArgentinaServer() )
    val serverAdmin = Invoker( command )

    serverAdmin.run()
}