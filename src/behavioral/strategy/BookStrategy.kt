package behavioral.strategy

import behavioral.observer.Book

interface BookStrategy {
    fun findBook( title : String ) : Book
}