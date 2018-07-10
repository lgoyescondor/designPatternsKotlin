package creational.prototype

class TvPrototype {
    private var prototypes : HashMap<String, TV> = HashMap<String, TV>()

    fun addPrototype( key : String, tvObject : TV ){
        prototypes.put( key, tvObject )
    }


    fun getPrototype( key : String ) : Any? {
        return prototypes.get( key )?.clone()
    }
}