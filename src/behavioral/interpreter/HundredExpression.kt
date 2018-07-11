package behavioral.interpreter

class HundredExpression : Expression() {
    override fun one(): String {
        return "C"
    }

    override fun four(): String {
        return "CD"
    }

    override fun five(): String {
        return "D"
    }

    override fun nine(): String {
        return "CM"
    }

    override fun multiplier(): Int {
        return 100
    }
}