import scala.io.StdIn.readInt
object myq2 extends App{
println("Enter Ticket Price:");
var p= readInt();
def attendee(p:Int):Int=120+(15-p)/5*20;
def revenue(p:Int):Int=attendee(p)*p;
def cost(p:Int):Int=500 + attendee(p)*3;
def profit(p:Int):Int= revenue(p)-cost(p);
println("The profit is "+ profit(p));







}
