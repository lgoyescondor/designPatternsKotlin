package creational.abstract_factory

import creational.prototype.TV

class Blue(
        override var description : String,
        var isPrimary : Boolean
) : Color( description ){
    override fun paint(tv: TV) {
        tv.color = "Blue"
        println("Painting blue the ${tv.brand} tv")
    }
}