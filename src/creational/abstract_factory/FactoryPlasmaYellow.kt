package creational.abstract_factory

import creational.prototype.Plasma
import creational.prototype.TV

class FactoryPlasmaYellow : TvAbstractFactory() {
    override fun createColor(): Color {
        return Yellow(description = "", isPrimary = true)
    }

    override fun createTv(): TV {
        return Plasma(
                "LG",
                25,
                "Black",
                10000000.0,
                5000000.0,
                0.05
        )
    }
}