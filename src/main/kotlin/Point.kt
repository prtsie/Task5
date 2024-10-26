import kotlin.math.hypot

class Point(val x: Double, val y: Double) {
    fun betweenThisAnd(point: Point) = Point((x + point.x) / 2, (y + point.y) / 2)
    fun angleWith(point: Point) = (point.y - y) / (point.x - x)
    fun distanceTo(point: Point) = hypot(x - point.x, y - point.y)
}