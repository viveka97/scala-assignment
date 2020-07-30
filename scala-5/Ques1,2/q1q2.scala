class Rational(val numerator:Int , val denominator:Int)
{

  def neg: Rational = new Rational(-numerator, denominator)

  def -(r: Rational) = new Rational(this.numerator * r.denominator - this.denominator * r.numerator, this.denominator * r.denominator)

  override def toString = s"$numerator / $denominator"

}

object q1q2 extends App{

  val x = new Rational(3, 4)
  val y = new Rational(5, 8)
  val z = new Rational(2, 7)

  println(x.neg)
  println(x-y-z)




}







