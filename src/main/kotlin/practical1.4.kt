fun main() {
    print("Enter a number: ")
    val number = readLine()?.toIntOrNull()

    if (number != null) {
        println("The number $number is " + if (number % 2 == 0) "even" else "odd")
    } else {
        println("Invalid input. Please enter a valid number.")
    }
}