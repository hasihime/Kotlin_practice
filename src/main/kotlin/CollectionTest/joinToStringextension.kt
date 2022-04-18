package CollectionTest

fun <T> Collection<T>.joinToStringextension(
    collection: Collection<T>,
    separator: String = ",",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(joinToString(list, ";", "(", ")"))
//    이걸 이렇게 표현도 가능
    println(joinToString(collection = list, separator = ";", prefix = "(", postfix = ")"))
    // separator, prefix, postfix 생략 가능
    println(joinToString(list ))
    //separator만 지정
    println(joinToString(list ,";"))
    // 코틀린은 순서 상관없이 가능
    println(joinToString(collection = list ,prefix = "(", postfix = ")"))
}
