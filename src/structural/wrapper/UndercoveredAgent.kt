package structural.wrapper

class UndercoveredAgent(
        var person : Person
) {
    fun getLastName() : String = "Perez"
    fun getAddress() : String = "Av Independencia 5432"
    fun getAge() : Int = person.age
}