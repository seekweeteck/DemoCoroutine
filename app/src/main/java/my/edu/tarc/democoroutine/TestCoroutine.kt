package my.edu.tarc.democoroutine

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class TestCoroutine {
    private val parentJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + parentJob)

    fun testRunFunction() {
        // Start a coroutine
        coroutineScope.launch {
            println("In start")
            Thread.sleep(200)
            println("In ended")
        }

        run {
            println("Out start")
            Thread.sleep(300)
            println("Out ended")
        }
    }
}