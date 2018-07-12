package behavioral.strategy

import behavioral.observer.Book

class BookFinder {
    fun findBook( person: Person, title: String ) : Book{
        val bookStrategy = when ( person ){
            is Partner -> NewGoodRegularStrategy()
            is Professor -> GoodNewRegularStrategy()
            else -> RegularGoodNewStrategy()
        }
        return bookStrategy.findBook(title )
    }
}