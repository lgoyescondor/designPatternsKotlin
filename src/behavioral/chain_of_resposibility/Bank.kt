package behavioral.chain_of_resposibility

class Bank : IApprover {
    override fun setNext(approver: IApprover) {
        next = approver
    }

    override fun getNext(): IApprover = next!!

    override fun startLending(amount: Int) {

        val firstUnit = FirstUnit()
        this.setNext( firstUnit )

        val leader = TeamLeader()
        firstUnit.setNext( leader )

        val manager = Manager()
        leader.setNext( manager )

        val director = Director()
        manager.setNext( director )

        next!!.startLending( amount )
    }

    private var next : IApprover? = null
}