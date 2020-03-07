import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main() {

    // Default Dispatcher
    GlobalScope.launch(Dispatchers.Default) {  }
    
}

