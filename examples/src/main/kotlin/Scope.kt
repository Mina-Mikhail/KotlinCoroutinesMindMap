import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

private var myJob: Job = Job()
private val myContext: CoroutineContext = Dispatchers.Default + myJob
private val myScope: CoroutineScope = CoroutineScope(myContext)

fun main() {
    
    myJob = myScope.launch {
        println("Hello World")
    }

    myScope.cancel()
}
