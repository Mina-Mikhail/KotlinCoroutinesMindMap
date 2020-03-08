import kotlinx.coroutines.*
import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte0.suspended

suspend fun main() {
    GlobalScope.launch {
        foo()
    }

    searchNewsAPI("friends")
    searchNewsAPIAsync("friends")
}

suspend fun foo() {

}

suspend fun searchNewsAPI(query: String) {
    withContext(Dispatchers.IO) {
        // Background Thread.
    }
}

fun searchNewsAPIAsync(query: String) = GlobalScope.async {
    searchNewsAPI(query)
}

val header = suspend { fetchHeader() }
val article = suspend { fetchArticle(header) }

fun fetchHeader() {

}

fun fetchArticle(header: suspend () -> Any) {

}

// Structured concurrency with async
suspend fun getNumberOfArticles() = coroutineScope {
    val generalNews = async { searchNewsAPI("General") }
    val sportNews = async { searchNewsAPI("Sport") }
    generalNews.await(); sportNews.await()
}

suspend fun getNumberOfAuthors() = supervisorScope {

}



