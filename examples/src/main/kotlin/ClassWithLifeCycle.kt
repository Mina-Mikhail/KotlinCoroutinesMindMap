import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class ClassWithLifeCycle : CoroutineScope {
    private lateinit var job: Job
    override val coroutineContext: CoroutineContext = Dispatchers.Default

    fun fetchDataFromAPI() {
        launch {

        }
    }

    fun onDestroy() {
        job.cancel()
    }
}

