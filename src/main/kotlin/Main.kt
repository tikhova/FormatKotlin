import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.FileOutputStream
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    val fileName = readLine()
    val cs = CharStreams.fromFileName("src/test/$fileName.in")
    val lexer = SimpleFunctionLexer(cs)
    val tokenStream = CommonTokenStream(lexer)
    val parser = SimpleFunctionParser(tokenStream)
    val function = parser.func()
    val outputStreamWriter =
            OutputStreamWriter(FileOutputStream("/shared/YandexDisk/ITMO/year2019/parsers/FormatKotlin/src/test/$fileName.out"))
    val visitor = KotlinFunctionVisitor(outputStreamWriter)
    visitor.visitFunc(function)
    outputStreamWriter.close()
}