package structural.proxy

class StoreRemote : IStore {
    override fun store(dataToStore: ArrayList<Any>) {
        println("Storing data in remote object...")
    }
}