package behavioral.command

interface IServer{
    fun turnOff()
    fun turnOn()
    fun connect()
    fun checkConnection()
    fun storeLog()
    fun disconnect()
}