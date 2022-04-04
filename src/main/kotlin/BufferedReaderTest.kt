import java.util.StringTokenizer

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {

    var st = StringTokenizer(readLine())

    println(Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()))
}