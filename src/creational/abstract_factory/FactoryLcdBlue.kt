package creational.abstract_factory

import creational.prototype.LCD
import creational.prototype.TV

class FactoryLcdBlue : TvAbstractFactory() {
    override fun createColor(): Color {
        return Blue(description = "", isPrimary = true)
    }

    override fun createTv(): TV {
        return LCD(
                "SAMSUNG",
                21,
                "Black",
                10000000.0,
                5000000.0
        )
    }
}