package and.optimization

import and.optimization.brokenLine.Task
import kotlin.math.cos

val task = Task(
    from = 0.0,
    to = 10.0,
    epsilon = 1e-2,
//    epsilon = 1e-4,
    func = { cos(it) - (it * it - 10 * it) / 100 }
)

fun main() {
    println("Hello World!")
}