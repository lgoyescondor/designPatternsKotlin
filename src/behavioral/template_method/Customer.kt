package behavioral.template_method

class Customer(
        var customerNumber : Int
) : Person() {
    override fun getIdType(): String = "numero de cliente"

    override fun getIdentification(): String = customerNumber.toString()
}