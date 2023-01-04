
fun main () {


//List 
val list :List <String> = listOf("Donn", "Tushar", "Kavita", "Evelyn", "Felicia")

// Set
val set :Set <String> = setOf("Donn", "Tushar", "Kavita", "Evelyn", "Felicia")

// Map: Key, Value Pairs
val map :Map <String,String> = mapOf("Donn" to "Felker", "Tushar" to "Muhaj", "Evelyn" to "Smith") // Map relie deux éléments emsemble
 
val map2 :Map <Int, String> = mapOf(1 to "Dohn", 2 to "Tushar") // Map relie deux éléments emsemble 

// Sequence
val sequence :Sequence <Int> = sequenceOf(1,2,3,4,5)

}

// méthode pour convertir
/*

list.asSequence()
map.asSequence()
sequence.toList()
etcs

 */