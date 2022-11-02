//importing Scanner and creating MergeSortDemo class
import java.util.Scanner;
public class MergeSortDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int a[]= new int[100];
int n;
//Asking for no of elements to be stored in array and assigning that value to n.
System.out.println("Enter the number of elements in the array:");
n=sc.nextInt();
//using for loop, we store the inputs in the array a[].
System.out.println("Enter the elements in the array:");
//printing elements to show how the elements are given
for(int i=0;i<n;i++) a[i]=sc.nextInt();
 System.out.println("Before Sorting:"); for(int i=0;i<n;i++)
System.out.printf("%d\n",a[i]);
//creating object ob for MergeSort class
MergeSort ob=new MergeSort();
//calling mergesort method by object
ob.mergeSort(a,0,n-1);
//printing the sorted form of elements after merge sort
System.out.println("\nAfter Sorting:");
for(int i=0;i<n;i++)
System.out.printf("%d\n",a[i]);
sc.close(); 
    }
}
