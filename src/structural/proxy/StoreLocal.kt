package structural.proxy

class StoreLocal : IStore {
    override fun store(dataToStore: ArrayList<Any>) {
        println("Storing data in HDD...")
    }
}