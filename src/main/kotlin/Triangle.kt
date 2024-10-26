class Triangle(val first: Point, val second: Point, val third: Point) {
    fun getInnerCircle(): Circle {
        val firstCenter = first.betweenThisAnd(second)
        val secondCenter = second.betweenThisAnd(third)
        val m1 = -1 / first.angleWith(second)
        val m2 = -1 / second.angleWith(third)
        val x = (m1* firstCenter.x - firstCenter.y + secondCenter.y - m2 * secondCenter.x) / (m1 - m2)
        val y = m1 * (x - firstCenter.x) + firstCenter.y
        val circleCenter = Point(x, y)
        return Circle(circleCenter, circleCenter.distanceTo(first))
    }
}