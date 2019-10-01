fun main(args: Array<String>) {
    for (words in getAnagramList("eventyr.txt")) {
        println(words)
    }
}

fun getAnagramList(fileName: String): List<List<String>> {
    return getWords(fileName)
            .map { it.trim() }
            .groupBy { it.toCharArray().sorted().joinToString("") }
            .filter { it.value.size > 1 }
            .map { it.value }
}