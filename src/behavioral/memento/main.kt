package behavioral.memento

fun main(args: Array<String>) {
    val caretaker = Caretaker()

    val p = Person()
    p.name = "Maxi"
    p.name = "Juan"

    caretaker.addMemento( p.saveToMemento() )

    p.name = "Pedro"

    caretaker.addMemento( p.saveToMemento() )

    p.name = "Diego"

    val m1 : Memento = caretaker.getMemento(0)!!
    val m2 : Memento = caretaker.getMemento(1)!!

    println( m1.getSavedState() )
    println( m2.getSavedState() )
}