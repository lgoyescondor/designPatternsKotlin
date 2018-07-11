package behavioral.chain_of_resposibility

class FirstUnit : IApprover {
    override fun setNext(approver: IApprover) {
        next = approver
    }

    override fun getNext(): IApprover = next!!

    override fun startLending(amount: Int) {
        if( amount <= 10000 ){
            println("Lo manejo yo, el ejecutivo de cuentas")
        }else{
            next?.startLending( amount )
        }
    }

    private var next : IApprover? = null
}