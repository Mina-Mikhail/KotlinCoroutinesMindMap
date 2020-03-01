import kotlinx.coroutines.*

fun main() {

    // Coroutine Example
    GlobalScope.launch(Dispatchers.Default) {
        println("Hi")
    }
    // Thread.sleep(100)

    // Coroutine and Job Example
    val myJob: Job = GlobalScope.launch(Dispatchers.Default) {
        println("Hi from Coroutine 2")
    }
    // runBlocking { myJob.join() }



    // Coroutine that return a result
    val result: Deferred<Int> = GlobalScope.async {
        return@async 3
    }
    runBlocking { println("Result: ${result.await()}") }
}