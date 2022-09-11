class Circle(_name: String, _radius: Double) : Shape(_name) {
    var radius=_radius

    override fun printDimensions() {
        println("The radius of the circle ${this.name} is ${this.radius} and the area is ${this.getArea()}")
    }

    fun setDimensions(_radius:Double){
        this.radius=_radius
    }

    override fun getArea():Double{
        return Math.PI*this.radius*this.radius
    }

}