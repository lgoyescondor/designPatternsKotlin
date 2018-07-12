package behavioral.mediator

interface IChatUser {
    fun receive( from : String, msg : String )
    fun send( to : String, msg : String )
}