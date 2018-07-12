package behavioral.state

class Bank(
        var bankTellerState: BankTeller = BankTeller("Pepito")
){
    var name : String = ""
    var address : String = ""

    fun serve( person: Person){
        println("${person.name} ingresa a la fila")
        bankTellerState.serve( person )
    }

    fun suspend(){
        bankTellerState.suspend()
    }

    fun close(){
        bankTellerState.close()
    }

    fun open(){
        bankTellerState.open()
    }
}