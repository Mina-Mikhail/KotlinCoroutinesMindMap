import kotlinx.coroutines.*
import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte0.suspended

fun main() {
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

fun fetchHeader(): Any {

}

fun fetchArticle(header: suspend () -> Any): Any {

}


