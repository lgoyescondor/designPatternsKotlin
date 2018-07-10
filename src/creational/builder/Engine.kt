package creational.builder

class Engine {
    private var serialNumber : Long
    private var horsePower : Int

    constructor(serialNumber : Long = 0, horsePower : Int = 0 ){
        this.serialNumber = serialNumber
        this.horsePower = horsePower
    }

    fun setSerialNumber(serialNumber : Long) = apply{
        this.serialNumber = serialNumber
    }

    fun setHorsePower(horsePower : Int) = apply{
        this.horsePower = horsePower
    }
}