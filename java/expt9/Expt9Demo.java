/*
  AIM: Write a Java Program to create an abstract class named Shape 
  that contains two integers and an empty method named print Area(). 
  Provide three classes named Rectangle, Triangle and Circle such that 
  each one of the classes extends the class Shape. Each one of the classes 
  contains only the method print Area () that prints the area of the given shape.
 */
public class Expt9Demo {
    public static void main(String[] args) {
        Rectangle9 r = new Rectangle9(2,6);
        Triangle9  t = new Triangle9(2,6);
        Circle9    c = new Circle9(6);
        r.printArea();
        t.printArea();
        c.printArea();
    }
}
/*
 Output:
 Area of the Reactangle is 12
 Area of Triangle is 6.0
 Area of the Circle is : 113.03999999999999
 */
