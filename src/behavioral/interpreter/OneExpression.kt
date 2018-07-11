package behavioral.interpreter

class OneExpression : Expression() {
    override fun one(): String {
        return "I"
    }

    override fun four(): String {
        return "IV"
    }

    override fun five(): String {
        return "IV"
    }

    override fun nine(): String {
        return "IX"
    }

    override fun multiplier(): Int {
        return 1
    }
}