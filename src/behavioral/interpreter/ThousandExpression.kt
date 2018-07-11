package behavioral.interpreter

class ThousandExpression : Expression() {
    override fun one(): String {
        return "M"
    }

    override fun four(): String {
        return " "
    }

    override fun five(): String {
        return " "
    }

    override fun nine(): String {
        return " "
    }

    override fun multiplier(): Int {
        return 1000
    }
}