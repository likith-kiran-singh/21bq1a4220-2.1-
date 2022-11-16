public class Triangle9 extends Shape9 {
    Triangle9(int base,int height){
        a=base;
        b=height;
    }
    public void printArea(){
        double area=0.5*a*b;
        System.out.println("Area of Triangle is "+area);
        
    }
}
