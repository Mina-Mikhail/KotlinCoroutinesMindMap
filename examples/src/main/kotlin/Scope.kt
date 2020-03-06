import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

private val myErrorHandler: CoroutineExceptionHandler =
    CoroutineExceptionHandler { _: CoroutineContext, error: Throwable -> println(error.toString()) }
private var myJob: Job = Job()
private val myContext: CoroutineContext = Dispatchers.Default + myJob + myErrorHandler
private val myScope: CoroutineScope = CoroutineScope(myContext)

fun main() {

    SupervisorJob()
    myJob = myScope.launch {
        println("Hello World")
    }

    myScope.cancel()
}
