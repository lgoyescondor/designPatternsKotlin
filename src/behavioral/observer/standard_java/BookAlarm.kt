package behavioral.observer.standard_java

import behavioral.observer.Book
import java.util.*

class BookAlarm : Observable() {
    fun shootAlarm( book : Book ){
        setChanged()
        notifyObservers("Rompieron el libro: ${book.title}")
    }
}