package structural.composite

class Employee(
        private var fullname : String,
        private var position : String,
        private var salary : Double
) : ISalary {
    override fun getSalary(): Double = salary
}