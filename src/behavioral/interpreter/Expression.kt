package behavioral.interpreter

abstract class Expression {
    abstract fun one() : String
    abstract fun four() : String
    abstract fun five() : String
    abstract fun nine() : String

    abstract fun multiplier() : Int

    fun interpreter( context : Context ){
        if ( context.input.startsWith( nine() )){
            context.output += (9 * multiplier())
            context.input = context.input.substring(2)
        }else if ( context.input.startsWith( four() )){
            context.output += (4 * multiplier())
            context.input = context.input.substring(2)
        }else if ( context.input.startsWith( five() )){
            context.output += (5 * multiplier())
            context.input = context.input.substring(2)
        }

        while ( context.input.startsWith( one() )){
            context.output += (1 * multiplier())
            context.input = context.input.substring(2)
        }
    }
}