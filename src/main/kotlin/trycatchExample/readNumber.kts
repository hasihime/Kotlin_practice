import java.io.BufferedReader

fun readNumber(reader: BufferedReader) : Int?{
    try{
        val line=reader.readLine()
        return Integer.parseInt(line)
    }
    catch (e:java.lang.NumberFormatException){
        return null
    }
    finally {
        reader.close()
    }
}