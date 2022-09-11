fun main(args: Array<String>) {

    println("Please, type the dimensions for the square:")
    val s: Shape = Square("s", readLine()!!.toDouble(), readLine()!!.toDouble())
    println("Please, type the dimensions for the circle:")
    val c: Shape = Circle("c", readLine()!!.toDouble())
    println("Please, type the dimensions for the triangle:")
    val t: Shape = Triangle("t", readLine()!!.toDouble(), readLine()!!.toDouble(), readLine()!!.toDouble())
    println("Please, type the dimensions for the equilateral triangle:")
    val et: Shape = EquilateralTriangle("et", readLine()!!.toDouble())

    s.printDimensions()
    c.printDimensions()
    t.printDimensions()
    et.printDimensions()



}