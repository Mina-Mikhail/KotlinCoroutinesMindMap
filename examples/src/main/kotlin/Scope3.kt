import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.supervisorScope

fun main() = runBlocking {

    coroutineScope {
        println("Hello from coroutineScope")
    }

    supervisorScope {
        println("Hello from supervisorScope")
    }

}