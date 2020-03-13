import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import javax.xml.bind.JAXBElement

fun main() {

    // Channel
    val channel: Channel<Char> = Channel<Char>()

    // Coroutine A
    GlobalScope.launch(Dispatchers.Default) {
        val name = "Mohammad"
        for (char: Char in name) {
            channel.send(char)
        }
        // Close the Channel
        channel.close()
    }

    // Coroutine B
    GlobalScope.launch(Dispatchers.IO) {
        for (c in channel) {
            println(c)
        }
    }

    Thread.sleep(500)
}