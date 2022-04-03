data class Person(val name: String,
                  val age: Int?=null)

fun main(args: Array<String>) {
    val persons = listOf(Person("철수"),
    Person("영희",29))

    val oldest= persons.maxByOrNull { it.age ?: 0 }
    print("나이가 가장 많은 사람 : $oldest")



}