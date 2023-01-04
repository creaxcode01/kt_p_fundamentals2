// collections = Lists, Sets and mutablelist


fun main () {
    val list :List<String> = listOf("A", "B", "C")

    println(list + "D" + "E")
    println(list.isEmpty())

    // error, not working on normal list println(list[1])

    println ("A" !in list)
    println("Z" !in list)

    val empty :Set<Int> = setOf()

    println(empty.size == 0)
    println(empty.isEmpty())

    
    val blabla = listOf("A", "B", "C")

     for (letter in blabla) { // pour chaque lettre dans blabla (instanciation de listOf)
     print(blabla)
     }
 


    val list2  = mutableListOf("A", "B")
    list2.add("C")
    println(list)

    list2.remove("B")
    println(list)

    list2[0] = "X"
    list2[1] = "Y"

    println(list)


//
// Set
//



    val set = setOf('E', 'F', 'G')
    println(set.size == 0) // false    // set.size == 0 et set.isEmpty font la même chose
    println(set.isEmpty()) // false

    val newempty: Set<Int> = setOf()
    println(newempty.size == 0) // true
    println(newempty.isEmpty()) // true


    println("")



    val newset = setOf('A', 'B', 'A') // De plus, si vous dupliquez des arguments dans la fonction setOf , le deuxième argument sera ignoré. 
    println(newset) // [A, B]

    val oletters = setOf("U", "I", "O")
    println(oletters.contains("V")) // false
    println(oletters.contains("I")) // true
    println("O" in oletters) // true
    println("X" in oletters) // falseprintln("A" !in list) // false

    println("Z" !in oletters) // true
    println("A" !in oletters) // true

    println("")


    val qletters = setOf('A', 'B', 'C')
    for (letter in qletters) {
        print(qletters)
    }

    val fset = mutableSetOf('A', 'B')
    fset.add('C')
    println(fset) // [A, B, C]
    fset.remove('B')
    println(fset) // [A, C]








}



