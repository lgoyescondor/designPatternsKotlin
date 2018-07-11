package structural.proxy

class ConnectionManager{
    companion object {
        var connectionAvailable : Boolean = false

        fun connect() {
            connectionAvailable = true
        }

        fun disconnect(){
            connectionAvailable = false
        }

        fun isConnected() : Boolean = connectionAvailable
    }

}