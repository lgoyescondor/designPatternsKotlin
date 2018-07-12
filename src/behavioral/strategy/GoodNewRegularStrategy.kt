package behavioral.strategy

import behavioral.observer.Book

class GoodNewRegularStrategy : BookStrategy {
    override fun findBook(title: String): Book {
        val books = Library.getBooks()

        return Book("La sirenita", "Bueno")
    }
}