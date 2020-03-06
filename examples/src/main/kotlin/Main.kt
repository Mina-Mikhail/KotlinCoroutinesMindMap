import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


fun main() {
    println("Hello World")

    GlobalScope.launch {
        println("Hello World from Coroutine")
    }

    Thread.sleep(100)
}
