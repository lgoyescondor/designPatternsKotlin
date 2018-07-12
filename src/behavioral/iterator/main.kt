package behavioral.iterator

fun main(args: Array<String>) {
    val d = Division("Mi sucursal")
    d.addEmployee("Empleado 1")
    d.addEmployee("Empleado 2")

    val iter = d.iterator()
    while ( iter.hasNext() ){
        val e = iter.next()!!
        e.print()
    }
}