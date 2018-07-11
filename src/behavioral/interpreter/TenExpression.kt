package behavioral.interpreter

class TenExpression : Expression() {
    override fun one(): String {
        return "X"
    }

    override fun four(): String {
        return "XL"
    }

    override fun five(): String {
        return "L"
    }

    override fun nine(): String {
        return "XC"
    }

    override fun multiplier(): Int {
        return 10
    }
}