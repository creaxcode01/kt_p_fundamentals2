/* 


Vous pouvez créer une carte à l'aide de la fonction mapOf , puis utiliser des paires clé-valeur comme arguments pour spécifier des associations clé-valeur. Par exemple, vous pouvez définir une carte qui associe les pays à leurs capitales. Les paires peuvent être définies à l'aide d'un constructeur ou à l'aide de la fonction to .






*/







fun main () {      // <clé, valeur>
    val capitals :Map <String, String> = mapOf("USA" to "Washington", "Poland" to "Warsaw", "Ukraine" to "Kyiv")
    println(capitals)

    val urbanmap :Map <String, Int> = mapOf ("Hauts-de-Seine" to 92, "Seine Saint denis" to 93)
    println(urbanmap)

    val alphabet :Map <Char, Int> = mapOf('A' to 1, 'B' to 2, 'C' to 3)
    println(alphabet)

    val number :Int? = alphabet['A']
    println(number)
    println(alphabet['B']) // 2
    println(alphabet['&']) // null
    
    val carte = mapOf('A' to "Alex", 'B' to "Bob")
    println('A' in carte) // true
    println('Z' in carte) // false
    println(carte.size) //2

    println()

    val carte2 = mapOf('A' to "Alex", 'B' to "Bob")
    for (entry in carte) {
        println("${entry.key} is for ${entry.value}")
    }

    println()

    val cartemutable :MutableMap<Char,String> = mutableMapOf('A' to "Alex", 'B' to "Bob")
    cartemutable.put('C',"Celina")   // .put disponible avec :MutableMap
    cartemutable['D'] = "Daria"      // disponible avec :MutableMap

    println(cartemutable) // {A=Alex, B=Bob, D=Daria, C=Celina}
    cartemutable.remove('B')
    println(cartemutable) // {A=Alex, D=Daria, C=Celina}



}

