import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main() {

    // Coroutine Example
    GlobalScope.launch(Dispatchers.Default) {
        println("Hi")
    }


    



}