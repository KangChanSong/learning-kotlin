package coroutines.test

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun runMultiplePrint() = runBlocking {
    launch {
        for (i in 1..100) {
            println("FIRST. threadName: ${Thread.currentThread().name}")
        }
    }

    launch {
        for (i in 1..100) {
            println("SECOND. threadName: ${Thread.currentThread().name}")
        }
    }

    launch {
        for (i in 1..100) {
            println("THIRD. threadName: ${Thread.currentThread().name}")
        }
    }

    println("LAST. threadName: ${Thread.currentThread().name}")
}