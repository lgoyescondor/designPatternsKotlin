package structural.flyweight

/**
 * Reduce redundancy when having a big amount of object with
 * identical information.
 */
fun main(args: Array<String>) {
    var studentsMean = 6.0

    val names = arrayOf("Juan", "Maxi", "Pedro")
    val lastNames = arrayOf("Perez", "Lopez", "Minna")
    val meanValues = doubleArrayOf( 6.0, 7.0, 9.0 )

    var student : Student = Student(generalMean = studentsMean)
    for ( index in 0 until names.size ){
        student.name = names[index]
        student.lastName = lastNames[index]
        student.mean = meanValues[index]
        println( "${student.name}: ${student.compare()}" )
    }
}