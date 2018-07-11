package behavioral.chain_of_resposibility

class Director : IApprover {
    override fun setNext(approver: IApprover) {
        next = approver
    }

    override fun getNext(): IApprover = next!!

    override fun startLending(amount: Int) {
        if( amount > 100000 ){
            println("Lo manejo yo, el director")
        }
    }

    private var next : IApprover? = null
}