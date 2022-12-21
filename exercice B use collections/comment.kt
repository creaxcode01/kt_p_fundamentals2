class Comment(
    val userId :Int,
    val message :String
)

/* class Comment2(
    val identifiant
    val message2
) */

fun main() {
    // Step 2  Liste de commentaire

    val comments :List <Comment> = listOf (
        Comment(5241, "Nice code"),
        Comment(6624, "Like it")
        Comment(5224, "what's going on?")
        Comment(9001, "Check out my website")
        Comment(8818, "Hello everyone :)")


    )

    // Step 3  Set d'utilisateurs bannis

     val blockedUserIds :Set <Int> = setOf(5224, 9001)

    // Step 4   Les relations entre les utilisateurs

     val userIdToRelation :Map <Int, String> = mapOf(5241 to "friend", 6624 to "close friend")

    // Step 5
    for (comment in comments) {
        
        // Step 6
        if (comment.userId !in blockedUserIds) {
            
            val relation = userIdToRelation[comment.userId] ?: "unknown"
            
            // Step 7
            println("Comment ${comment.message} from $relation")
        }
    }
}