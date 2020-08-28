object HelloApp extends App{  // App trait here has its own main method predefined
    println("Hello, World")
    // Looking at automatically availabe command line arguments
    if(args.length == 0)        // can use args.size as well
        println("Hello, World!")
    else
        println("Hello,     " + args(0))
}