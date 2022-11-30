/*
AIM: Write a multi-threaded Java program to print all numbers below 100,000 that are both prime and 
Fibonacci number (some examples are 2, 3, 5, 13, etc.). Design a thread that generates prime numbers
below 100,000 and writes them into a pipe. Design another thread that generates Fibonacci numbers and 
writes them to another pipe. The main thread should read both the pipes to identify numbers common to both.
 */
import java.io.IOException;
public class Expt12Demo{
    public static void main (String[] args)throws IOException {
        fibonacci fi=new fibonacci();
        prime pri=new prime();
        receiver r=new receiver(fi,pri);
        fi.start();
        pri.start();
        r.start();                      
    }
}
/*
 output :
2
3
5
13
89
233
1597
28657
 */