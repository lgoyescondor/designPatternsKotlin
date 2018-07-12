package behavioral.memento

class Person(var name : String = "") {
    fun saveToMemento() : Memento {
        println("Originator: Guardando memento")
        return Memento( name )
    }

    fun restoreFromMemento( m : Memento ){
        name = m.getSavedState()
    }
}