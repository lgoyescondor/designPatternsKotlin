package structural.facade

/**
 * simple interface for complex sub-systems
 */
fun main(args: Array<String>) {
    val c = Customer()
    val i = Interested()

    // First client
    val rs = RealState()
    rs.serveCustomer( c )
    rs.serveInterested( i )

    val showProperty = ShowProperty()
    showProperty.showProperty( 123 )

    val sellProperty = SellProperty()
    sellProperty.organizeSale()

    val renting = Renting()
    renting.charge( 1200.0 )

    val debts = Debts()
    debts.payOwner( 1100.0 )

    // Second client (using facade)
    val rs2 = RealState()
    rs2.serve( c )
    rs2.serve( i )
    rs2.showProperty.showProperty(123)
    rs2.sellProperty.organizeSale()
    rs2.renting.charge(1200.0)
    rs2.debts.payOwner(1100.0)
}