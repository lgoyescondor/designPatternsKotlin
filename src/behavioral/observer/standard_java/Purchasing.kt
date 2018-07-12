package behavioral.observer.standard_java

import java.util.*

class Purchasing : Observer {
    override fun update(o: Observable?, arg: Any?) {
        println( arg )
        println("Compras: ")
        println("Solicito nueva cotizacion...")
    }

}