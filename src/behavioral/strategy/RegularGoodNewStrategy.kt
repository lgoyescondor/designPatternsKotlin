package behavioral.strategy

import behavioral.observer.Book

class RegularGoodNewStrategy : BookStrategy {
    override fun findBook(title: String): Book {
        val books = Library.getBooks()

        return Book("Sherlock Holmes", "Regular")
    }
}