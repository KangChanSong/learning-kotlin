package coroutines.coroutine_basics

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun runHeavyJobInCoroutine() = runBlocking {
    repeat(500_000) {
        launch {
            delay(100L)
            println(".")
        }
    }
}