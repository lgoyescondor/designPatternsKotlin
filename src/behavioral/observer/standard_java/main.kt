package behavioral.observer.standard_java

import behavioral.observer.Book

fun main(args: Array<String>) {
    val book = Book("Windows es estable", "MALO")

    val library = Library()
    library.returnBook( book )
}