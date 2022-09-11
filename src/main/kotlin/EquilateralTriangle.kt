import kotlin.math.sqrt

class EquilateralTriangle(_name: String, _side: Double) : Triangle(_name, _side,_side,_side) {

    var side=_side

    override fun printDimensions(){

        println("The side of the equilateral triangle ${this.name} is ${this.side} and the area is ${this.getArea()}")

    }
    fun setDimensions(_side:Double){
        this.side=_side
    }

    override fun getArea(): Double {
        var s = (this.side*3)*0.5
        return sqrt(s*(s-this.side)*(s-this.side)*(s-this.side))
    }


}