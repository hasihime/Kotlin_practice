package geometry.shapes

import java.util.Random

class Rectangle(val hegith: Int, val witdh: Int) {
    val isSquare: Boolean
        get() = hegith == witdh
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}