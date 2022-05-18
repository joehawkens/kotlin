import kotlin.system.exitProcess

fun main(){


    // Create a question class to use for the question Objects...

    class Question {

        var question: String = "string"
        var answer = "string"
        var choices = arrayOf("string", "string", "string", "string")

    }

    // Creating the questions for the quiz games as Objects...

    var question1 = Question()

    question1.question = "Who was the first president of the United States?"
    question1.answer = "1"
    question1.choices = arrayOf("George Washington", "Barrack Obama", "Joe Biden", "Donald Trump")

    var question2 = Question()

    question2.question = "What is the Earth's largest continent?"
    question2.answer = "3"
    question2.choices = arrayOf("North America", "Antarctica", "Asia", "Europe")

    var question3 = Question()

    question3.question = "Approximately, how many heads are on Easter Island?"
    question3.answer = "4"
    question3.choices = arrayOf("17", "10", "103", "887")


    // Put the questions inside an array...

    var quizQuestions = arrayOf(question1, question2, question3)


    // Create a map of the correct answers for the user to access after the game...

    val correctAnswer = buildMap() {

        put("Question 1 ", " George Washington")
        put("Question 2 ", " Asia")
        put("Question 3 ", " 887")

    }


    // Create a function that prompts the user for their name and introduces the game...

    fun startGame() {

        println("Welcome to the Quiz game.")
        print("Enter your name: ")
        val input = readLine()
        println("Hello, $input welcome to the quiz game")

    }


    // A function that checks the user input with the answers from the Question Objects...

    fun checkAnswer(answer: String, correct: String) {

        if (answer == correct) {

            println("Good job, you're a winner!")
            return

        } else {

            println("Sorry! You're a loser.")
            print("Would you like to view the correct answers? (y/n)")
            val viewCorrect = readLine()

            if (viewCorrect == "y"){

                println(correctAnswer)
                exitProcess(0)

            } else {

                exitProcess(0)
            }

        }


    }


    fun beginQuiz() {

        // QUESTION 1...

        println("Here is your first question... ")
        println(question1.question)


        var counter = 1
        for (x in question1.choices) {
            println("Answer $counter: $x")
            counter ++
        }

        println("Enter your answer (ex: 1): ")
        var firstAnswer = readLine()

        checkAnswer(firstAnswer.toString(), question1.answer)



        // QUESTION 2...

        println("Here is your second question... ")
        println(question2.question)

        var counter2 = 1
        for (x in question2.choices) {
            println("Answer $counter2: $x")
            counter2 ++
        }

        println("Enter your answer (ex: 1): ")
        var secondAnswer = readLine()

        checkAnswer(secondAnswer.toString(), question2.answer)




        // QUESTION 3...

        println("Here is your Third question... ")
        println(question3.question)

        var counter3 = 1
        for (x in question3.choices) {
            println("Answer $counter3: $x")
            counter3 ++
        }

        println("Enter your answer (ex: 1): ")
        var thirdAnswer = readLine()

        checkAnswer(thirdAnswer.toString(), question3.answer)



    }


    startGame()
    beginQuiz()

}