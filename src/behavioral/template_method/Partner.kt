package behavioral.template_method

class Partner(
        var partnerNumber : Int
) : Person(){
    override fun getIdType(): String = "numero de socio"

    override fun getIdentification(): String = partnerNumber.toString()

}