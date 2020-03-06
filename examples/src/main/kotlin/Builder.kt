import kotlinx.coroutines.*

fun main() {

    // runBlocking Builder
    runBlocking {
        println("Hello World")
    }


    // launch Builder
    GlobalScope.launch(Dispatchers.Default) {
        println("Hello World from Coroutine")
    }

    // Or
    val myJob: Job = GlobalScope.launch(Dispatchers.Default) {
        println("Hi from Coroutine 2")
    }


    // async Builder
    val myDeferred: Deferred<Int> = GlobalScope.async { return@async 1 }


}