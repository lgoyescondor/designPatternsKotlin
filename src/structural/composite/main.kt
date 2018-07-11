package structural.composite

fun main(args: Array<String>) {
    var bank : Bank = Bank()

    var management : ManagementSector = ManagementSector()
    var sales : SalesSector = SalesSector()
    var administration : AdministrationSector = AdministrationSector()

    bank.add( management )
    bank.add( sales )
    bank.add( administration )

    var salesperson1 = Employee("Pepito Perez", "Salesman", 2000.0)
    var salesperson2 = Employee("Fulano de Tal", "Salesman", 2000.0)
    sales.add( salesperson1 )
    sales.add( salesperson2 )

    var manager = Employee( "Jesus Isaza", "Manager", 5000.0)
    management.add(manager)

    var administrator = Employee( "Claudia Naval", "Administrator", 3000.0)
    administration.add(administrator)

    println( bank.getSalary() )
}