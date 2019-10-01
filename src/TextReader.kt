import java.io.File
import java.io.IOException
import java.nio.charset.Charset


fun getWords(name: String): List<String>{
    try {
        return File(name).readText(Charset.forName("UTF-8")).split("\n")
    } catch (e: IOException) {
        print("Failed to open file, maybe file does not exist on current path?")
        throw e
    }
}