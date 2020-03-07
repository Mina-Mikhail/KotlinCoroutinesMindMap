import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch {
        foo()
    }
}

suspend fun foo() {

}

suspend fun searchNewsAPI(query: String) {
    withContext(Dispatchers.IO) {
        // Background Thread.
    }
}

