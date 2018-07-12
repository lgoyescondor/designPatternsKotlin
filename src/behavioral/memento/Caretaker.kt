package behavioral.memento

class Caretaker {
    private var states = ArrayList<Memento>()

    fun addMemento(m : Memento){
        states.add( m )
    }

    fun getMemento(index : Int) : Memento? = states[index]
}