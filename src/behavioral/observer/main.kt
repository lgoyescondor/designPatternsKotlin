package behavioral.observer

/**
 * Necesito:
 * 1. Interfaz (IBadState) tiene el metodo reactivo que deben tener
 * todos los observadores ante un cambio
 * 2. Todos los observadores deben implementar la interfaz IBadState
 * 3. Interfaz (Subject) que tiene los metodos attach, dettach y notify
 * 4. Clase que contenga una lista con todos los observadores y herede
 *      y sobrecargue la interfaz Subject
 * 5. Implementar la clase que tiene la lista de observadores
 */
fun main(args: Array<String>) {
    val a : BookAlarm = BookAlarm()
    a.attach( Purchasing() )
    a.attach( Administration() )
    a.attach( Stock() )

    val book = Book( "Cien años de soledad", "MALO")

    val b = Library()
    b.returnBook( book )
}