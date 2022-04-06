package geometry.example

import geometry.shapes.createRandomRectangle

fun main (args: Array<String>) {
    println("정사각형?")
    println(createRandomRectangle().isSquare)
}