import scala.io.StdIn.readInt
object q6 extends App{
  println("Enter the limit: ");
  var num = readInt()
  def fib(num:Int):Int = num match {
    case num if num==0 => 0
    case num if num==1 => 1
    case num => fib(num-1) + fib(num-2)

  }

  def fib_sequence(num:Int):Any={
    if(num>0) fib_sequence(num-1)
    println(fib(num))


  }
  println(fib_sequence(num));
}
