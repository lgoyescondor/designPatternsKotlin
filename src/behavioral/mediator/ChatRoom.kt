package behavioral.mediator

class ChatRoom : IChatRoom {
    override fun register(user: User) {
        participants.put( user.name, user )
    }

    override fun send(from: String, to: String, msg: String) {
        if( participants.containsKey(from) && participants.containsKey(to) ){
            val u = participants.get(to)
            u!!.receive( from, msg )
        }else{
            println("Usuario inexistente")
        }
    }

    private var participants = HashMap<String, User>()
}