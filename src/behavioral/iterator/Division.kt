package behavioral.iterator

class Division(private var divisionName : String){
    private var employees = arrayOfNulls<Employee>(100)
    /*private var employees = Array<Employee>(100){
        Employee()
    }*/
    private var number : Int = 0

    fun getName() : String {
        return divisionName
    }

    fun addEmployee( employeesName : String ){
        val employee = Employee( employeesName, divisionName )
        employees[ number++ ] = employee
    }

    fun iterator() : DivisionIterator {
        return DivisionIterator( employees )
    }
}