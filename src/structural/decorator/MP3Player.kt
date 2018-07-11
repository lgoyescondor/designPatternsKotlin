package structural.decorator

class MP3Player( override var accessory: Accessory ) :
        CarDecorator(accessory = accessory) {
    override fun getDescription(): String {
        return accessory.getDescription() + " + MP3Player"
    }

    override fun getPrice(): Int {
        return accessory.getPrice() + 250
    }

}