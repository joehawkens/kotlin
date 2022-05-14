fun main() {

    // Var is used to declare mutable variables and their data types.

    var todaysDate: String = "05/13/2022"
    println(todaysDate)


    var currentWeather: String
    currentWeather = "Windy."
    println(currentWeather)


    // Val is used to declare variables that are immutable.

    val pi: Double = 3.14
    println(pi)


    // With Kotlin, Type inference is a common practice, where the compiler takes declared variables that are aren't
    // explicitly declared, such as:
    var name = "Joe"
    // will be assumed to be a string.

    // Another example would be
    var boolean = true
    // The compiler assumes that this is a boolean value and doesn't question further - however, errors
    // will occur if the variable is tried to be changed.


    // Let's attempt to make a class...

    class Question(

        var points: Int,
        val question: String,
        val difficulty: String


    )

    // Declaring an object...




}