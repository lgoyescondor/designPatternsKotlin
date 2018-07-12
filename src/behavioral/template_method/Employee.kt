package behavioral.template_method

class Employee(
        var directory : String
) : Person() {
    override fun getIdType(): String = "directory number"

    override fun getIdentification(): String = directory
}