public class SquareThread13 extends Thread{
    int n;
    SquareThread13(int num){
        n=num;
    }
    public void run(){
        System.out.println("Square of ("+n+")^2 is " +(n*n));
    }        
}