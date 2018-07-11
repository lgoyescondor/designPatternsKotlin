package structural.proxy

fun main(args: Array<String>) {
    val proxy = StoreData()
    ConnectionManager.connectionAvailable = true
    proxy.store(
            arrayListOf("Carne","Verduras","Arroz")
    )
}