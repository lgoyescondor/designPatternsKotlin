package behavioral.state

class StateClosed : BankTellerState {
    override fun serve(person: Person) {
        println("Ventanilla cerrada!")
    }
}