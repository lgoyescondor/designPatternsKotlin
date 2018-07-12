package behavioral.state

class StateSuspended : BankTellerState {
    override fun serve(person: Person) {
        if( person.age > 65 ){
            println("Atendiendo a ${person.name}")
        }else{
            println("Espere 5 minutos por favor")
        }
    }
}