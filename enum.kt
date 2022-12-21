enum class PizzaSize(      // header, un paramètre
val sizeInCm :Int
) {
SMALL(15),
MEDIUM(20),            // body
LARGE(25),
EXTRALARGE(30)
}



enum class Letter { 
    A, 
    B, 
    C, 
} 


enum class SecondLetter(val smallLetter :Char, val number :Int) {
    D('a',12),
    E('b',45),
    F('c',56),

}


fun printSize(pizzaSize :PizzaSize) {
    println("$pizzaSize is ${pizzaSize.sizeInCm} cm")
}





fun main() {
    printSize(PizzaSize.MEDIUM) // MEDIUM is 20 cm
    printSize(PizzaSize.EXTRALARGE) // EXTRALARGE is 30 cm


    println(Letter.B.ordinal)  // ordre {binaire} d'apparition


    println(SecondLetter.D.smallLetter)
    println(SecondLetter.D.number)
}