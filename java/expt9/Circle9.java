public class Circle9 extends Shape9{
    Circle9(int radius){
        a=radius;
    }
    public void printArea(){
        double area= 3.14*a*a;
        System.out.println(("Area of the Circle is : "+area));
    }
}
