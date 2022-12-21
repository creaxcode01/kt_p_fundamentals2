/* Example Exceptions

fun main() {
    val result = 10 / 0   // ArithmeticException,  aucun chiffre n'est divisable par 0 en programmation
    val number = "ABC".toInt() // NumberFormatException,  Impossible de traduire un String en Int

    println(result)
    println(number)
    println("Done") 
}
 */

 
 fun main(){  // ressemble a un if else mais pour les exception
    try {
        val num :Int = "ABC".toInt() // error, impossible de convertir ABC en Int
        println(num)
        println("success")
    } catch (y :NumberFormatException)  { // or catch (y :Throwable)  = Throwable can catch everything, it catches all exceptions
        println("Exception Caught")
        println("failure")
    }


 }
 
 /* 
 fun someFunction() {
        throw Throwable("Some error")          // throw
    println("Will not be printed")
    }
    */
    
    