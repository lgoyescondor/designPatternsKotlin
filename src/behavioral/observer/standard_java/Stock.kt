package behavioral.observer.standard_java

import java.util.*

class Stock : Observer {
    override fun update(o: Observable?, arg: Any?) {
        println(arg)
        println("Stock: ")
        println("Le doy de baja")
    }
}