import scala.io.StdIn.readInt
object q4 extends App{
  println("Enter the number: ");
  var num=readInt();
  def odd_even(num:Int):Unit= num%2 match{
    case x if(x==0) => println("Even")
    case x if(x==1) => println("Odd")


  }
  println(odd_even(num));


}
