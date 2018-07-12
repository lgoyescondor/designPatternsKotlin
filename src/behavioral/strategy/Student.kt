package behavioral.strategy

class Student(
        override var name : String,
        override var lastName : String,
        var meanGrade : Double
) : Person(name, lastName)