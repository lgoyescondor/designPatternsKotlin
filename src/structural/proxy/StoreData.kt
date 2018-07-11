package structural.proxy

class StoreData : IStore {
    override fun store(dataToStore: ArrayList<Any>) {
        if( ConnectionManager.connectionAvailable ){
            StoreRemote().store( dataToStore )
        }else{
            StoreRemote().store( dataToStore )
        }
    }
}