package algorithm

import java.util.StringTokenizer
import kotlin.math.sqrt

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {

    var st = StringTokenizer(readLine())
    val loopcnt: Int = Integer.parseInt(st.nextToken())
    val sb = StringBuilder()

    for (i in 1..loopcnt) {
        st = StringTokenizer(readLine())

        var s = Integer.parseInt(st.nextToken())
        var e = Integer.parseInt(st.nextToken())

        var l = e - s
        var d: Double = sqrt(l.toDouble())
        var dint = d.toInt()
        var ddecmal = d - d.toInt()

        when {
            (ddecmal == 0.0) -> sb.append((dint) * 2 - 1).append("\n")
            (ddecmal != 0.0 && ddecmal in 0.0..0.5) -> sb.append((dint) * 2).append("\n")
            (ddecmal != 0.5 && ddecmal in 0.5..1.0) -> sb.append((dint + 1) * 2 - 1).append("\n")
        }
    }
    println(sb)
}