package behavioral.state

class StateOpen : BankTellerState {
    override fun serve(person: Person) {
        println("Atendiendo a ${person.name}")
    }
}