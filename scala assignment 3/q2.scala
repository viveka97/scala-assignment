import scala.io.StdIn.readInt
object q2 extends App{
println("Enter a number: ");
var p= readInt()
def gcd (a:Int, b:Int):Int= b match{
  case 0 => a
  case b if b>a => gcd(b,a)
  case _ => gcd(b,a%b)

}
def prime(p:Int, n:Int=2):Boolean = n match {
  case x if (p==x) => true
  case x if (gcd(p,x)>1) => false
  case x => prime(p, x+1) 
}
def print_prime(n:Int):Any= {
  if(n>2) print_prime(n-1)
  if(prime(n)==true){
  if(n>=2) println(n)
  
  }


}
println(print_prime(p));
}
