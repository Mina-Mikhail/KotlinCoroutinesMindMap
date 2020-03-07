import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main() {

    // Default Dispatcher
    GlobalScope.launch(Dispatchers.Default) {  }

    // IO Dispatcher
    GlobalScope.launch(Dispatchers.IO) {  }

    // Unconfined Dispatcher
    GlobalScope.launch(Dispatchers.Unconfined) {  }

    // Main Dispatcher
    GlobalScope.launch(Dispatchers.Main) {  }
}

