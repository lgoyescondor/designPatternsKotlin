package structural.adapter

import java.util.*

interface IPersonOld {
    fun getName() : String
    fun setName( name : String )
    fun getLastname() : String
    fun setLastname( lastname : String )
    fun getBirthdate() : Date
    fun setBirthdate( birthdate : Date )
}