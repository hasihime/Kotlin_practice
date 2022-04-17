package CollectionTest
import CollectionTest.joinToString



fun reportOpertioncount(){
    println("Operation performed $opCount times")
}
fun main(args: Array<String>)  {
    val set = arrayListOf(1, 5, 6)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    val strings = listOf("zip", "gago", "sipda")
    reportOpertioncount()
    println(strings.last())
    println(set.maxOrNull())
    println(map)
    println(joinToString(strings))
    reportOpertioncount()





}