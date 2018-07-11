package behavioral.interpreter

fun main(args: Array<String>) {
    val roman = "LXI"
    val context = Context( roman )

    // Construimos el arbol
    val tree = ArrayList<Expression>()
    tree.add( ThousandExpression() )
    tree.add( HundredExpression() )
    tree.add( TenExpression() )

    var it : Iterator<Expression> = tree.iterator()
    while ( it.hasNext() ){
        var exp : Expression = it.next()
        exp.interpreter( context )
    }

    println( context.output )
}