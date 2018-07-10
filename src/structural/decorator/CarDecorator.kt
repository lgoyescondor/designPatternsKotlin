package structural.decorator

abstract class CarDecorator(
        open var accessory : Accessory
) : Accessory {
}