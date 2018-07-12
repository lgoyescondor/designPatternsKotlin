package behavioral.state

fun main(args: Array<String>) {
    val person1 = Person("Juan", "Perez", 21)
    val person2 = Person("Sabrina","Campas",15)
    val person3 = Person("Liz","Juarez",71)
    val person4 = Person("JJ","River a la Promo",42)

    val bank = Bank()
    bank.serve( person1 )
    bank.suspend()

    bank.serve( person2 )
    bank.serve( person3 )

    bank.close()
    bank.serve( person4 )
}