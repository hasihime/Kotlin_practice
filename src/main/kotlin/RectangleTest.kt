class RectangleTest(val width:Int, val height:Int) {
    val isSquare:Boolean
    get(){
        return width==height
    }
}

fun main(args: Array<String>){
    val rectangle=RectangleTest(10,5)
    println(rectangle.isSquare)
}