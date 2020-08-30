/* There are 2 types of variables in Scala:
    Immutable: val
    Mutable: var
*/    
object Variables extends App{

    val x = 5;
    // Let's try to change the value of an immutable variable.
    //x = x + 1   // Adding this line gave an error reassigning to val

    var y = 5
    // Reassigning to mutable variable.
    y = y + 1


    // Type is optional
    
    val count = 1
    val num: Int = 1  // Use explicit form when u need to be clear or compiler may confuse it for other type

    // For Example:
    val i: Int = 1
    val b: Byte = 1

    val name = "Jack"
    val c = 'V' 
}