package behavioral.mediator

fun main(args: Array<String>) {
    val chatRoom = ChatRoom()

    val u = User( chatRoom, "Juan")
    chatRoom.register(u)

    val u1 = User( chatRoom, "Pepe")
    chatRoom.register(u1)

    val u2 = User( chatRoom, "Pedro")
    chatRoom.register(u2)

    u.send("Pepe", "Hola como andas?")
    u1.send("Juan", "Todo ok, vos?")
    u2.send("Martin", "Martin estas?")
}