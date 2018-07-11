package behavioral.iterator

class Employee(
        private var name: String = "",
        private var division : String = "" ){
    fun getName():String = name
    fun print() {
        println( "Nombre: "+name+" Division: "+division )
    }
}