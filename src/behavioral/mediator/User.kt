package behavioral.mediator

class User(
        private var chatRoom : ChatRoom,
        var name : String
) : IChatUser {
    override fun receive(from: String, msg: String) {
        val s = "El usuario $from te dice $msg"
        println( "$name: $s")
    }

    override fun send(to: String, msg: String) {
        chatRoom.send( name, to, msg )
    }

}