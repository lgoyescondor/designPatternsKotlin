package behavioral.observer

interface Subject {
    fun attach ( observer : IBadState )
    fun dettach ( observer : IBadState )
    fun notifyObservers()
}