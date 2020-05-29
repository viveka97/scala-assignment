import scala.io.StdIn.readInt
object q5 extends App{
  println("Enter the number:");
  var n = readInt();
   def is_even(n:Int):Boolean= n%2 match{
     case 0 => true
     case 1 => false
      
   }

def show_num(n:Int):Any={
  if(n>0) show_num(n-1)
    if(is_even(n)==true)
    {
      if(n>0) println(n)
    }
}
println(show_num(n))





}
