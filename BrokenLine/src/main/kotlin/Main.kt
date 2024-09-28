package and.optimization

import and.optimization.brokenLine.Task
import kotlin.math.cos
import kotlin.math.exp

val task = Task(from = 0.0, to = 10.0, epsilon = 1e-2,
//    epsilon = 1e-4,
    func = { cos(it) - (it * it - 10 * it) / 100 })

val chordTask = Task(  // TODO: Eject to another project
    from = 0.0,
    to = 1.0,
    epsilon = TODO(),
    func = { it * it * it + exp(-it) }
)

// x = 0.458, f = 0.798, N=8, N = 23 - no clue
val newtonTask = Task(  // TODO: Eject to another project
    from = TODO(),
    to = TODO(),
    epsilon = TODO(),
    func = { it * it * it + exp(-it) }
)

fun main() {
    println("Hello World!")
}