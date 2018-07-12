package behavioral.observer.standard_java

import java.util.*

class Administration : Observer{
    override fun update(o: Observable?, arg: Any?) {
        println( arg )
        println("Administracion: ")
        println("Envio una queja formal...")
    }
}