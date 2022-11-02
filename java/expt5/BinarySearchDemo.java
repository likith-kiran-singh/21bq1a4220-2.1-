import java.util.Scanner;
//importing scanner class for taking input from user.
//creating BinarySEarchDemo class
public class BinarySearchDemo {  
    public static void main(String[] args) {
try (// creating varible sc for scanner class
    Scanner sc = new Scanner(System.in)) {
        int a[]=new int[100]; 
        int n,i,key; 
//Asking for no of elements to be stored in array and aassigning that value to n.
        System.out.println("Enter no of elements in the array : ");
        n=sc.nextInt();
//using for loop, we store the inputs in the array a[].
        System.out.println("Enter elements in the array : ");
for(i=0;i<n;i++) {
        a[i]=sc.nextInt();
}
//Asking the search element that to be found.
System.out.println("Enter the key : ");
key=sc.nextInt();
//creating a object b1 for BinarySearch constructor to access that class.
//passing array,size of array,key to that constructor.
BinarySearch b1=new BinarySearch(a,n,key);
//Calling the binarysearch method with the help of the object created.
b1.binarysearch(); 
sc.close();
    }
} 
}