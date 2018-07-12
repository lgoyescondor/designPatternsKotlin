package behavioral.template_method

fun main(args: Array<String>) {
    val p = Customer(1234)
    println("Cliente dice: ${p.identifyYourself()}")

    println("El empleado dice: ${Employee("AD 41252").identifyYourself()}")

    println("El socio dice: ${Partner(46232).identifyYourself()}")
}