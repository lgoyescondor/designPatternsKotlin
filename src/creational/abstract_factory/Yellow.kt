package creational.abstract_factory

import creational.prototype.TV

class Yellow(
        override var description : String,
        var isPrimary : Boolean
) : Color( description ){
    override fun paint(tv: TV) {
        tv.color = "Yellow"
        println("Painting yellow the ${tv.brand} tv")
    }
}