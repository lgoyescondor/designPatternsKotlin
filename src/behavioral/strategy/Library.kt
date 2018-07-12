package behavioral.strategy

import behavioral.observer.Book

class Library {
    companion object {
        private val books = ArrayList<Book>()
        fun getBooks() = books
    }
    init {
        val book = Book("Un titulo", "Bueno")

        books.add( book )
    }
}