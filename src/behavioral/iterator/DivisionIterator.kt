package behavioral.iterator

class DivisionIterator ( private var employees : Array<Employee?> ) {
    private var location : Int = 0

    fun next() : Employee? {
        return employees[ location ++ ]
    }

    fun hasNext() : Boolean = ( location < employees.size &&
            employees[location] != null )
}