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

}