package behavioral.strategy

class Professor(
        override var name : String,
        override var lastName : String,
        var directory : String
) : Person(name, lastName)