package behavioral.memento

class Memento (private var state : String){
    fun getSavedState() = state
}