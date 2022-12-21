// la nullabilité est un principe de programmation lorsqu'une variable n'a pas de valeur, on utilise null pour indiquer qu'une variable n'a pas de valeur
// revoir la nullabilité

var name :String = "Hervé"
var name2 :String? = null  // le "?" veut dire que la valeur peut être soit nulle soit une string
var name3 :String? = null
var name4 :String? = "écologie"


var i :Int? = null 
var h :Int? = null
var x :Int? = null
var f :Int? = 12

class User (val name :String) {
var user :User? = null 
}

fun processUser(user :User?) :User? {  // attent un résultat de type null ou :User
    return user

}

fun main() {
    processUser(null)



    // 
    // appel sécurisé .? veut dire que si ce n'est pas un null, la fonction s'éxécute normalement, autrement le null est pris en compte
    //

    var message: String? = "Hello World"
println(message?.length) //Will print 11 
message = null //Assign null to the variable
println(message?.length) //Will print null

println(name4)
println(f)


}

//
//  ?:  The Elvis operator is used to provide a default value when a value could be null ?: 
//





//
// Smart-casting
/* 

fun consume(a: String?) {

    if (a != null) {
println(a.length) // the type of a is String
    } else {
println("Cannot handle null")
    }

}

*/