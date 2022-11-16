//AIM: Write a Java Program to Handle Arithmetic Exceptions and InputMisMatchExceptions.

import java.util.*;
public class expt11 {
    
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a : ");
            a=sc.nextInt();
            System.out.println("Enter b : ");
            b=sc.nextInt();
            int c=a/b;
            System.out.println("Result : "+c);
        }catch(ArithmeticException e){
            System.out.println("Divded by zero error!  -->  "+e);
        }catch(InputMismatchException e){
            System.out.println("Exception -->  "+e);
        }
        sc.close();
    }


}
/*
  Output : 
  i.    Enter a : 
        20
        Enter b : 
        5
        Result : 4
  ii.   Enter a : 
        20
        Enter b : 
        0
        Divded by zero error!  -->  java.lang.ArithmeticException: / by zero
  iii.  Enter a : 
        20
        Enter b : 
        l
        Exception -->  java.util.InputMismatchException
 */