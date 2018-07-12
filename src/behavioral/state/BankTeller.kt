package behavioral.state

class BankTeller(
        var name : String
) {
    var state : BankTellerState = StateOpen()

    fun suspend(){
        state = StateSuspended()
    }
    fun close(){
        state = StateClosed()
    }
    fun open(){
        state = StateOpen()
    }
    fun serve(person: Person){
        state.serve( person )
    }
}