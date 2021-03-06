import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


// Channels Type

val rendezvousChannel: Channel<Int> = Channel<Int>(Channel.RENDEZVOUS)
val conflatedChannel: Channel<Int> = Channel<Int>(Channel.CONFLATED)
val bufferedChannel: Channel<Int> = Channel<Int>(Channel.BUFFERED)
val unlimitedChannel: Channel<Int> = Channel<Int>(Channel.UNLIMITED)


// Main() become a Coroutine with runBlocking
fun main(): Unit = runBlocking {

    // Create a Channel
    val simpleChannel: Channel<Int> = Channel<Int>()

    // Create a Coroutine
    launch {
        // Sending by our Channel
        for (i in 1..5) {
            simpleChannel.send(i)
        }
        // Close the Channel
        simpleChannel.close()
    }

    // Receiving from the Channel
    for (value: Int in simpleChannel) {
        println(value)  // -> simpleChannel.receive()
    }

}