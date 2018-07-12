package behavioral.observer.standard_java

import behavioral.observer.Book

class Library {
    val a = BookAlarm()

    constructor(){
        a.addObserver( Purchasing() )
        a.addObserver( Administration() )
        a.addObserver( Stock() )
    }

    fun returnBook( book : Book){
        if ( book.state == "MALO" ){
            a.shootAlarm( book )
        }
    }
}