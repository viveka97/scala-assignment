
object q1 extends App{
  val point1=Point(2,3)
  val point2=Point(5,6)
  val point3=point1.move(2,3)
  println(point1)
  println(point2)
  println(point3)

  val point4= point1+point2
  println(point4)

  println(point1.distance(point2))
  println(point1.invert)

  case class Point(a:Int , b:Int)
  { 
      def x:Int = a
      def y:Int = b

      def move(dx:Int , dy:Int) = Point(this.x +dx, this.y +dy)
      
      def +(n1:Point) = Point(n1.x + this.x, n1.y +this.y)

      def distance(n1:Point) = Point(this.x - n1.x, this.y - n1.y)

      def invert() = Point(this.y , this.x)
    



  } 


}
