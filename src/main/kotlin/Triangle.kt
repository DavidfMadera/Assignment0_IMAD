import kotlin.math.sqrt

open class Triangle(_name: String, _side1: Double, _side2: Double, _side3: Double) : Shape(_name) {

    var side1=_side1
    var side2=_side2
    var side3=_side3

    override fun printDimensions() {
        println("The sides of the triangle ${this.name} are ${this.side1}, ${this.side2} and ${this.side3} and the area is ${this.getArea()}")
    }
    fun setDimensions(_side1:Double,_side2:Double,_side3:Double){
        side1=_side1
        side2=_side2
        side3=_side3
    }

    override fun getArea(): Double {
        var s = (this.side1+this.side2+this.side3)*0.5
        return sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3))
    }
}