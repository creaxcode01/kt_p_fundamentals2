//
// sealed class
//

// a sealed class is abstract
// a sealed class cannot be instantiated but herited


sealed class IOError {
constructor() { /*...*/ } // protected by default
private constructor(description :String) :this() { /*...*/ } // private or protected constructors for sealed classes
// public constructor(code: Int): this() {} // Error: public and internal are not allowed
}









//
// annotation class
//

annotation class MyAnnotation(val someDescription :String)

@MyAnnotation("Class annotation")
class A(
 @MyAnnotation("Constructor property annotation")
val a :Int
) {
 @MyAnnotation("Method annotation")
  fun b() {}
}