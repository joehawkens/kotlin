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


    // Making a class...

    class Question {

        var question: String = "string"
        var answer = "string"
        var choices = arrayOf("string", "string", "string", "string")

    }


    // Declaring an object...

    var question1 = Question()

    question1.question = "Who was the first president of the United States?"
    question1.answer = "George Washington"
    question1.choices = arrayOf("George Washington", "Barrack Obama", "Joe Biden", "Donald Trump")

    var question2 = Question()

    question2.question = "What is the Earth's largest continent?"
    question2.answer = "Asia"
    question2.choices = arrayOf("Asia", "Antarctica", "North America", "Europe")


    // Put the questions inside an array...

    var quizQuestions = arrayOf(question1, question2)


    // Create a function that prompts the first question...




}

