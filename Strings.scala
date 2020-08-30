object Strings extends App{
    val fname = "Van"
    val mname = "C"
    val lname = "Diego"

    val fullname= s"$fname $mname $lname" // String Interpolation
    println(fullname)


// Output with indents
    val speech = """ Hi, I am Vansh,
                     I am practicing
                     multiline strings
                     in scala."""
    println(speech)

// Output without indents
    val speech2 = """Hi, I am Vansh,
                     |I am practicing
                     |multiline strings
                     |in scala.""".stripMargin
    println(speech2)
}