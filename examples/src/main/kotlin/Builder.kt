import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

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


    val totalTime: Long = measureTimeMillis {
        runBlocking {
            val turtleTime: Deferred<Long> = async { functionA() }
            val rabbitTime: Deferred<Long> = async { functionB() }
            println("functionA: ${turtleTime.await()} functionB: ${rabbitTime.await()}")
        }
    }
    println("Total Time $totalTime")

}

suspend fun functionA(): Long = measureTimeMillis {
    delay(4000)
}

suspend fun functionB(): Long = measureTimeMillis {
    delay(4000)
}