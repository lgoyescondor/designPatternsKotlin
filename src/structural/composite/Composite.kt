package structural.composite

open class Composite : ISalary {

    var employees : ArrayList<ISalary> = arrayListOf<ISalary>()

    override fun getSalary(): Double {
        var sum : Double = 0.0
        for( employee in employees ){
            sum += employee.getSalary()
        }
        return sum
    }

    fun add( p : ISalary ){
        employees.add( p )
    }
}