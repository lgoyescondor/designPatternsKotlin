package structural.flyweight

class Student(
        var name : String = "",
        var lastName : String = "",
        var mean : Double = 0.0,
        var generalMean : Double = 0.0
){
    fun compare() : Double = ( mean / generalMean - 1 )* 100.0
}