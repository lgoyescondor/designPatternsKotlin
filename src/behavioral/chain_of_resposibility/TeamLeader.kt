package behavioral.chain_of_resposibility

class TeamLeader : IApprover {
    override fun setNext(approver: IApprover) {
        next = approver
    }

    override fun getNext(): IApprover = next!!

    override fun startLending(amount: Int) {
        if( amount <= 50000 ){
            println("Lo manejo yo, el lider")
        }else{
            next?.startLending( amount )
        }
    }

    private var next : IApprover? = null
}