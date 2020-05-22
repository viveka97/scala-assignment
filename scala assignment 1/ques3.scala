
object ques3 extends App{
def book(x:Int):Double={
var cover:Double=(24.95*x)-((24.95)*x*(0.4));
var shipping:Double=0.0;
if(x>50)
{
  shipping=(3*50)+((x-50)*(3.75));
}
else
{
  shipping=(x*3);
}
var total:Double=cover+shipping;
return total;
}
println(book(60));

}
