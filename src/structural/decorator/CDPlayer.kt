package structural.decorator

class CDPlayer(
        override var accessory: Accessory
) : CarDecorator(accessory = accessory) {
    override fun getDescription(): String {
        return accessory.getDescription() + " + CD Player"
    }

    override fun getPrice(): Int {
        return accessory.getPrice() + 100
    }
}