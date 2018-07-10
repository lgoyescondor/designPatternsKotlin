package structural.adapter

import java.util.*

class OldToNewAdapter(val oldPerson : IPersonOld ) : IPersonNew {

    override fun getName(): String {
        return oldPerson.getName() + " " +  oldPerson.getLastname()
    }

    override fun setName(fullName: String) {
        var splittedName : List<String> = fullName.split(" ")
        var firstName : String = splittedName[0]
        var lastName : String = splittedName[1]
        oldPerson.setName( firstName )
        oldPerson.setLastname( lastName )
    }

    override fun getAge(): Int {
        var c1 : GregorianCalendar = GregorianCalendar()
        var c2 : GregorianCalendar = GregorianCalendar()
        c2.timeInMillis = oldPerson.getBirthdate().time
        return c1.get(1) - c2.get(1)
    }

    override fun setAge(age: Int) {
        var c : GregorianCalendar = GregorianCalendar()
        var currentYear : Int = c.get(1)
        c.set( GregorianCalendar.YEAR, currentYear - age)
        oldPerson.setBirthdate( c.time )
    }
}