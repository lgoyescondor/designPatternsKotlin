package creational.prototype

class LCD (
        override val brand : String,
        override val screenInches : Int,
        override var color : String,
        override val price : Double,
        var manufacturingCost : Double) : TV ( brand, screenInches, color, price )