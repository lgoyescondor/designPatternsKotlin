package structural.facade

class RealState(
        var showProperty: ShowProperty = ShowProperty(),
        var sellProperty: SellProperty = SellProperty(),
        var debts: Debts = Debts(),
        var renting: Renting = Renting()
){
    fun serveCustomer( c : Customer ){
        println("Serving customer..")
    }
    fun serveOwner( o : Owner ){
        println("Serving owner..")
    }
    fun serveInterested( i : Interested ){
        println("Serving interested..")
    }
    fun serve( p : Person ){
        when ( p ){
            is Customer -> serveCustomer( p )
            is Owner -> serveOwner( p )
            is Interested -> serveInterested( p )
        }
    }
}