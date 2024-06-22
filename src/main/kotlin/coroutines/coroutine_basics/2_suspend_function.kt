package coroutines.coroutine_basics

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun runMyFirstSuspendFunction() = runBlocking {
    launch {
        doWorld()
    }
    println("Hello,")
}

/**
 * suspend function
 * - 코루틴 안에서 일반 함수처럼 실행된다.
 * - suspend function 안에서 delay()와 같이 코루틴을 suspend 하는 함수를 실행시킬 수 있다.
 */
suspend fun doWorld() {
    delay(1000L)
    println("World!")
}