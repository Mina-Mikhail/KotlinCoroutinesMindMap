import kotlinx.coroutines.*
import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte0.suspended

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

val header = suspend { fetchHeader() }
val article = suspend { fetchArticle(header) }

fun fetchHeader(): Any {

}

fun fetchArticle(header: suspend () -> Any): Any {

}
