package coroutines.coroutine_basics

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun runMyFirstExplicitJob() = runBlocking {
    val job: Job = launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    job.join()
    println("Done")
}