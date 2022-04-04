class PersonTest (
    val name: String,
    var isMarried: Boolean
)

fun main(args: Array<String>){
    val person=PersonTest("Bob",true)

    println(person.name)
    print(person.isMarried)
}