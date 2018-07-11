package behavioral.chain_of_resposibility

interface IApprover {
    fun setNext( approver : IApprover )
    fun getNext() : IApprover
    fun startLending( amount : Int )
}