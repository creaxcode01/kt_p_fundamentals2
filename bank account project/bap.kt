fun main() {



    // Step 1

    println("Welcome to your banking account")
    println("What type of account would you like to create?")
    println("1. Debit account")
    println("2. Credit account")
    println("3. Checking account")

    // Step 2

    var accountType = ""
    var userChoice = 0

    // Step 3

    while (accountType == "") { // while loop
    println("Choose an option (1, 2 or 3)")
    userChoice = (1..5).random() // choisit un nombre au hasard entre 1 et 5
    println("the selected option is ${userChoice}.")

    when (userChoice) {  // similaire à case dans java
        1 -> accountType = "debit"
        2 -> accountType = "credit"
        3 -> accountType = "checking"
        else -> continue   // autrement, la boucle while continue
    }
 }

 // Step 4
 println("You have created a ${accountType} account")




}