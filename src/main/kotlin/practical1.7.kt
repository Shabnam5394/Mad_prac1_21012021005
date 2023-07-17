fun main() {
    print("Enter a number: ")
    val number = readLine()?.toIntOrNull()

    if (number != null && number >= 0) {
        val factorial = calculateFactorial(number)
        println("The factorial of $number is: $factorial")
    } else {
        println("Invalid input. Please enter a non-negative integer.")
    }
}

tailrec fun calculateFactorial(n: Int, accumulator: Long = 1): Long {
    return if (n == 0) {
        accumulator
    } else {
        calculateFactorial(n - 1, n.toLong() * accumulator)
    }
}





