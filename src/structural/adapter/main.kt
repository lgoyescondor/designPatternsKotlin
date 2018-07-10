package structural.adapter

import java.util.*

/**
 * It shall be used when:
 *  - Class 'A' can use a method fX. Class 'B' wants to use fX
 *  but it cannot.
 *  - 'A' cannot be modified
 */
fun main(args: Array<String>) {
    var birthDate : GregorianCalendar = GregorianCalendar()
    birthDate.set(2000, 1, 1)

    var oldPerson : PersonOld = PersonOld(
            "Maxi",
            "Perez",
            birthDate.time
    )

    var newPerson : OldToNewAdapter = OldToNewAdapter( oldPerson )

    println( newPerson.getAge() )
    println( newPerson.getName() )

    newPerson.setAge( 10 )
    newPerson.setName("Juan Goyes")

    println( newPerson.getAge() )
    println( newPerson.getName() )
}