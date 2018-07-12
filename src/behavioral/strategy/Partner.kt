package behavioral.strategy

class Partner(
        override var name : String,
        override var lastName : String,
        var subscriptionFee : Double
) : Person(name, lastName)