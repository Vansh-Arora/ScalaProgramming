class Complex{
      println("Enter the real part of first number ")
      var r1=readInt()
      println("Enter the Imaginary part of first number ")
      var i1=readInt()
      println("Enter the real part of second number ")
      var r2=readInt()
      println("Enter the Imaginary part of second number ")
      var i2=readInt()
      def sum(){
      println("The sum is " + (r1+r2) + "+" + "i" + (i1+i2) ) }
      def diff(){
      println("The difference is " + (r1-r2) + "+" + "i" + (i1-i2) ) }
      def pro(){
      println("The product is " + (r1*r2) + "+" + "i" + (i1*i2) ) }
      }