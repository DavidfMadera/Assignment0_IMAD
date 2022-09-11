class Square(_name: String,_height: Double,_length: Double) : Shape(_name) {

    var length=_length
    var height=_height

    override fun printDimensions() {
        println("The length of the square ${this.name} is ${this.length}, the height is ${this.height} and the area is ${this.getArea()}")
    }

    fun setDimensions(_lenght:Double,_height:Double){
        this.length=_lenght
        this.height=_height
    }

    override fun getArea(): Double {
        return this.length*this.height
    }
}