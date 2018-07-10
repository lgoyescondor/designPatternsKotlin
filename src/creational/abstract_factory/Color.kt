package creational.abstract_factory

import creational.prototype.TV

abstract class Color(
        open var description : String
) {
    abstract fun paint( tv : TV);
}