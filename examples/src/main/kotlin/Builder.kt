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

    // Or
    val totalTime: Long = measureTimeMillis {
        runBlocking {
            val functionATime: Deferred<Long> = async { functionA() }
            val functionBTime: Deferred<Long> = async { functionB() }
            println("functionA: ${functionATime.await()} functionB: ${functionBTime.await()}")
        }
    }
    println("Total Time $totalTime")


    // withContext
    runBlocking {
        println("1 ${Thread.currentThread().name}") // 1 main
        val result: String = withContext(Dispatchers.IO) {
            println("2 ${Thread.currentThread().name}") // 2 DefaultDispatcher-worker-3
            "Mohammad"
        }

        println(result)
        println("3 ${Thread.currentThread().name}") // 3 main
    }

}


suspend fun functionA(): Long = measureTimeMillis {
    delay(4000)
}

suspend fun functionB(): Long = measureTimeMillis {
    delay(4000)
}

