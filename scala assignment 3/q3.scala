import scala.io.StdIn.readInt
object q3 extends App{
  println("Enter a number: ");
  var num = readInt()
  def sum(n:Int):Int={
    num match{
    case 1 => num
    case _ => num+ sum(num-1);

    }

  }
println("sum is "+sum(num));


}
