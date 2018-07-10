package structural.adapter

class PersonNew(
        private var name : String,
        private var age : Int
) : IPersonNew {
    override fun getName(): String {
        return name
    }

    override fun setName(name: String) {
        this.name = name
    }

    override fun getAge(): Int {
        return age
    }

    override fun setAge(age: Int) {
        this.age = age
    }
}