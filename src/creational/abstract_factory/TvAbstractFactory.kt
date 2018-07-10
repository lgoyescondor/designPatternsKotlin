package creational.abstract_factory

import creational.prototype.TV

abstract class TvAbstractFactory {
    abstract fun createTv() : TV;
    abstract fun createColor() : Color;
}