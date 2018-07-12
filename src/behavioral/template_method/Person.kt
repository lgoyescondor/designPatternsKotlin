package behavioral.template_method

abstract class Person {
    fun identifyYourself() : String{
        var message = "Me identifico con: "
        message += getIdType()
        message += ". El numero es: "
        message += getIdentification()

        return message
    }

    abstract fun getIdType() : String
    abstract fun getIdentification() : String

}