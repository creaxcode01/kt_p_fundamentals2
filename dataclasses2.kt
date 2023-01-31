
//
// Data classes
//



/*
 data class permet après de println le contenu et non l'adresse mémoire (ex: Dog@18ef96) comme avec une class classique
 avec une data class on peut utiliser la méthode .copy()
 une data class est instanciable
*/



/*

   -- Partie class normal --

fun main() {
    val value1 = Value(42) // instanciation objet de Value
    val value2 = Value(42)
    println(value1 == value2)  // false
    println(value1)




    println("")


    -- Partie data class --

    val value3 = DataValue(42) // instanciation objet de DataValue
    val value4 = DataValue(42)
    println(value3 == value4) // true
    println(value3)
}

 */


 
data class Dog(
val name :String,
val age :Int
)



fun main() {
val dog = Dog("Pluto", 7)
val (name, age) = dog      // attention à l'orde choisi

println(name) // Pluto     // les arguments doivent suivre l'ordre choisi
println(age) // 7          // les arguments doivent suivre l'ordre choisi


//
// Pair 
//


val tpair = Pair(1.0, 'A') // _Structuration (Assemblage) (dans le même objet)  stockage de la méthode (instanciation objet) grace à Pair( , )
// or val tpair = 1.0 to A
println(tpair.first) // 1.0
println(tpair.second) // A


val (numbero, lettero) = tpair  // _Destructuration (sépare en deux variable)
     // the type of numbero is Double, it could be numbero or another name ex: numberx
     // the type of lettero is Char, it could be lettero or another name ex: letterv

println(numbero) // 1.0
println(lettero) // A

//
// Triple 
//

val pair = Triple(1F, "ABC", true)  // méthode Triple() avec 3 arguments
println(pair.first) // 1.0
println(pair.second) // ABC
println(pair.third) // true

val (number, letters, boolean) = pair // _Destructuration (sépare en trois variable)
    // the type of number is Double
    // the type of letters is Char 
    // the type of boolean is Boolean
    
println(number) // 1.0
println(letters) // ABC
println(boolean) // true

}





