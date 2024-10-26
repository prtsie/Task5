fun main(args: Array<String>) {
    fun getPointFromUser(message: String): Point {
        println(message)
        while (true) {
            print("Координата X >>> ")
            val x = readln().toDoubleOrNull()
            if (x == null) {
                println("Неверный ввод")
                continue
            }

            print("Координата Y >>> ")
            val y = readln().toDoubleOrNull()
            if (y == null) {
                println("Неверный ввод")
                continue
            }
            return Point(x, y)
        }
    }

    val first = getPointFromUser("Введите первую точку треугольника")
    val second = getPointFromUser("Введите вторую точку треугольника")
    val third = getPointFromUser("Введите третью точку треугольника")

    val triangle = Triangle(first, second, third)
    val circle = triangle.getInnerCircle()

    println("Координаты центра вписанной окружности: (${circle.center.x}, ${circle.center.y})")
    println("Радиус: ${circle.radius}")
}

