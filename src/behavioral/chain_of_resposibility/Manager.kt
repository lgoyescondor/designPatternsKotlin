package behavioral.chain_of_resposibility

class Manager : IApprover {
    override fun setNext(approver: IApprover) {
        next = approver
    }

    override fun getNext(): IApprover = next!!

    override fun startLending(amount: Int) {
        if( amount <= 100000 ){
            println("Lo manejo yo, el gerente")
        }else{
            next?.startLending( amount )
        }
    }

    private var next : IApprover? = null
}