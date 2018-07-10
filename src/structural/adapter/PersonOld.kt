package structural.adapter

import java.util.*

class PersonOld(
        private var name : String,
        private var lastName : String,
        private var birthDate : Date
) : IPersonOld {
    override fun getName(): String {
        return name
    }

    override fun setName(name: String) {
        this.name = name
    }

    override fun getLastname(): String {
        return lastName
    }

    override fun setLastname(lastName: String) {
        this.lastName = lastName
    }

    override fun getBirthdate(): Date {
        return birthDate
    }

    override fun setBirthdate(birthDate: Date) {
        this.birthDate = birthDate
    }
}
