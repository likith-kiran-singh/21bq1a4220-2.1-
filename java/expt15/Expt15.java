/*
AIM: Write a Java program that reads a file name from the user, displays information 
about whether the file exists, whether the file is readable, or writable, the type of 
file and the length of the file inbytes.
 */
import java.io.File;
import java.util.Scanner;


class Expt15{
    public static void main(String args[]){
        String s;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter file name : ");
        s=sc.next();
        File f1=new File(s);
        System.out.println(f1.exists()?"File exists":" File does not exist");
        System.out.println(f1.canWrite()?"File is writable":"File is not writable");
        System.out.println(f1.canRead()?"File is readable":"File is not readable");
        System.out.println(f1.isFile()?"File is normal file":"File might be a named pipe");
        System.out.println("File size :"+f1.length()+"Bytes");
        sc.close();
    }
}
/*
Output :
Enter file name : 
Binarysearch.java
File exists
File is writable
File is readable
File is normal file
File size :1024Bytes
 */