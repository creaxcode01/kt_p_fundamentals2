class Value(val value :Int)

data class DataValue(val value :Int)


fun main() {
    val value1 = Value(42) // instanciation objet de Value
    val value2 = Value(42)
    println(value1 == value2)  // false,    compare la place dans la mémoire
    println(value1)




    println("")


    //
    // Partie data class 
    // 

    val value3 = DataValue(42) // instanciation objet de DataValue
    val value4 = DataValue(42)
    println(value3 == value4) // true,  compare l'intérieur des variable (42 & 42)
    println(value3)
}