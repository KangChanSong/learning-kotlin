package coroutines.coroutine_basics

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun runMyFirstCoroutines() =
    /**
     * runBlocking
     *  - 코루틴 빌더. 코루틴 외부 코드와의 브릿지 역할.
     *  - 주로 애플리케이션의 최상단 레벨에 선언된다.
     *  - 스레드는 값비싼 자원이기 때문에 스레드를 블로킹하는 것은 비효율적이다.
     *
     * launch
     *  - 코루틴 빌더. 새로운 코루틴을 나머지 코드와 동시에 실행되도록 해준다.
     *
     *  delay
     *  - suspending function. 코루틴을 일정 시간동안 suspend 한다.
     *  - suspend 되어도 스레드가 블로킹되지 않고 다른 코루틴이 스레드를 사용할 수 있다.
     */
    runBlocking {
        launch {
            delay(1000L)
            println("World!")
        }
        println("Hello,")
    }

/**
 * structured concurrency
 * - 모든 코루틴은 특정 CoroutineScope 내에서만 시작될 수 있다.
 * - 이것은 코루틴이 lost 혹은 leaked 되지 않게 해준다.
 * - outer scope 는 자신의 모든 코루틴들이 완료되기 전에 끝날 수 없다.
 */