package behavioral.mediator

interface IChatRoom {
    fun register( user : User )
    fun send( from : String, to : String, msg : String )
}