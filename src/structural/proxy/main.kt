package structural.proxy

fun main(args: Array<String>) {
    val proxy = StoreData()
    proxy.store(
            arrayListOf("Carne","Verduras","Arroz")
    )
}