package coroutines.coroutine_basics

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun runMyFirstScopeBuiler() = runBlocking {
    doHelloWorld()
}

/**
 * runBlocking
 * - blocks the current thread for waiting
 * coroutineScope
 * - just suspends, releasing the underlying thread for other usages.
 */
suspend fun doHelloWorld() = coroutineScope {
    launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
}

fun runMyFirstScopeBuilderMultiple() = runBlocking {
    doHelloWorldMultiple()
}

suspend fun doHelloWorldMultiple() = coroutineScope {
    launch {
        delay(2000L)
        println("World2")
    }
    launch {
        delay(1000L)
        println("World1")
    }
    println("Hello,")
}