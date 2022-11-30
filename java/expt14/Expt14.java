/*
 AIM: Write a java program that correctly implements the 
 producer-consumer problem using the concept of inter-thread communication.
 */
public class Expt14 {
    public class Main {
        public static void main(String args[]) {
            Q14 q=new Q14();
            new Producer14(q);
            new Consumer14(q);
            System.out.println("press control c to stop");
        }
    }
    
}
/*
Output :

 */