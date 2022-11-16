public class CubeThread13 extends Thread{
    int n;
    CubeThread13(int num){
        n=num;
    }
    public void run(){
        System.out.println("Cube of ("+n+")^3 is " +(n*n*n));
    } 
}