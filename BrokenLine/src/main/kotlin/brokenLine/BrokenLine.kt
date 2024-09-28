package and.optimization.brokenLine

data class Task(val from: Double, val to: Double, val epsilon: Double, val func: (Double) -> Double)

fun Task.solve(): Double = TODO("Implement")