/*Write a java program that implements a multi-threaded application that has three 
threads. First thread generates a random integer every 1 second and if the value
 is even, second thread computes the square of the number and prints. If the
value is odd, the third thread will print the value of cube of the number. */
import java.util.Scanner;
public class MultiThread13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many Numbers Do You Want to print : ");
        int i=sc.nextInt();
        RandomNumberThread13 rmThread=new RandomNumberThread13(i);
        rmThread.start();
        sc.close(); 
    }
}

/*
 Output : 
    How many Numbers Do You Want to print : 
    7
    The Number is : 26
    Square of (26)^2 is 676
    The Number is : 69
    Cube of (69)^3 is 328509
    The Number is : 23
    Cube of (23)^3 is 12167
    The Number is : 32
    Square of (32)^2 is 1024
    The Number is : 29
    Cube of (29)^3 is 24389
    The Number is : 7
    Cube of (7)^3 is 343
    The Number is : 1
    Cube of (1)^3 is 1
 */