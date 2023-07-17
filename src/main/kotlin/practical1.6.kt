fun main() {
    print("Enter the first number: ")
    val num1 = readLine()?.toDoubleOrNull()

    print("Enter the second number: ")
    val num2 = readLine()?.toDoubleOrNull()

    if (num1 != null && num2 != null) {
        println("Addition: ${add(num1, num2)}")
        println("Subtraction: ${subtract(num1, num2)}")
        println("Multiplication: ${multiply(num1, num2)}")
        println("Division: ${divide(num1, num2)}")
    } else {
        println("Invalid input. Please enter valid numbers.")
    }
}

fun add(num1: Double, num2: Double): Double {
    return num1 + num2
}

fun subtract(num1: Double, num2: Double): Double {
    return num1 - num2
}

fun multiply(num1: Double, num2: Double): Double {
    return num1 * num2
}

fun divide(num1: Double, num2: Double): Double {
    if (num2 != 0.0) {
        return num1 / num2
    } else {
        throw IllegalArgumentException("Division by zero is not allowed.")
    }
}