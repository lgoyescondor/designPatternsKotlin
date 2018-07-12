package behavioral.observer

class Library {
    fun returnBook( book : Book ){
        if ( book.state == "MALO" ){
            var a = BookAlarm()
            a.notifyObservers()
        }
    }
}