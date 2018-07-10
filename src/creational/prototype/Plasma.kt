package creational.prototype

class Plasma (
        override val brand : String,
        override val screenInches : Int,
        override var color : String,
        override val price : Double,
        var visionAngle : Double,
        var responseTime : Double) : TV ( brand, screenInches, color, price )