package creational.abstract_factory

import creational.prototype.TV

/**
 * Supports multiple standards defined by different
 * object hierarchy.
 */
fun main(args: Array<String>) {
    var f1 : TvAbstractFactory = FactoryLcdBlue()
    manufactureTV( f1 )

    var f2 : TvAbstractFactory = FactoryPlasmaYellow()
    manufactureTV( f2 )
}

fun manufactureTV( factory : TvAbstractFactory ){
    var color : Color = factory.createColor()
    var tv : TV = factory.createTv()
    color.paint( tv )
}