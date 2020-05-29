
object que1 extends App{

  def workHours(i1:Int):Int=i1*150;
  def ot(i2:Int):Int=i2*75;
  def income(i1:Int,i2:Int):Int=workHours(i1)+ot(i2);
  def tax(income:Int):Double=income*0.1;
  def total(i1:Int,i2:Int):Double=income(i1,i2)-tax(income(i1,i2));

  println(total(40,20));







}
