package structural.decorator

class AirConditioner(override var accessory : Accessory) : CarDecorator( accessory = accessory ) {
    override fun getDescription(): String {
        return accessory.getDescription() + " + Air Conditioner"
    }

    override fun getPrice(): Int {
        return accessory.getPrice() + 1500
    }
}