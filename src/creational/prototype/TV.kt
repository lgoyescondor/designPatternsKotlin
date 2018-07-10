package creational.prototype

abstract class TV (
        open val brand : String,
        open val screenInches : Int,
        open val color : String,
        open val price : Double ) : Cloneable {

    @Throws(CloneNotSupportedException::class)
    public override fun clone() : Any {
        return super.clone()
    }
}