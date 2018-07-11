package structural.decorator

class Gasoil( override var accessory : Accessory ) :
        CarDecorator( accessory= accessory ) {
    override fun getDescription(): String {
        return accessory.getDescription() + " + Gasoil"
    }

    override fun getPrice(): Int {
        return accessory.getPrice() + 1200
    }

}