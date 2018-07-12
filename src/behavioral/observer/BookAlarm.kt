package behavioral.observer

class BookAlarm : Subject {
    override fun attach(observer: IBadState) {
        observers.add(observer)
    }

    override fun dettach(observer: IBadState) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        for( observer in observers ){
            observer.update()
        }
    }

    companion object {
        private val observers = ArrayList<IBadState>()
    }
}