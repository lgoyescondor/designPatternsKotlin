package behavioral.strategy

import behavioral.observer.Book

class NewGoodRegularStrategy : BookStrategy {
    override fun findBook(title: String): Book {
        val books = Library.getBooks()

        return Book("Atlantis", "Nuevo")
    }
}