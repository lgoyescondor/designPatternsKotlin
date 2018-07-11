package structural.wrapper
/**
 * Wrapper
 */
fun main(args: Array<String>) {
    val person = Person(
            name = "Juan",
            lastName = "Gilli",
            dni = "3241234141",
            age = 43,
            address = "av rivadavia asdf"
    )

    println("Datos de la persona: ")
    println(person.lastName + ", " + person.name )
    println(person.dni)
    println(person.address)
    println(person.age)

    println("Datos del agente: ")
    val agent = UndercoveredAgent( person )
    println( agent.getLastName() + ", " + agent.getName() )
    println( agent.getDNI() )
    println( agent.getAddress() )
    println( agent.getAge() )
}