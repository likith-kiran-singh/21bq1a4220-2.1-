class BinarySearch{
//creating a class  "BinarySearch" and adding 3 instance variables in it
    int arr[]=new int[100];
    int key,n;
//creating a constructor of the class BinarySearch
    BinarySearch(int a[],int b,int c)
    {
//the parameters passed to BinarySearch is assigned here with array arr,n with size of array,key with search element.
    arr=a;
    n=b;
    key=c;
    }
// creating a method as binarysearch
void binarysearch() {
    int mid,low=0,high=n-1;
    //as long as the low value doesn't exceed high,the while loop will execute.
    while(low<=high)  
    {
//the mid value is calculated for each loop and return the position if it is found.
    mid=(low+high)/2;
    if(key==arr[mid])    
    {
    System.out.println("Key found at : "+(mid+1)+" position in the array");
//system.exit is like return in python.
    System.exit(0);
    }
    else if(arr[mid]>key)
        high=mid-1;
    else
        low=mid+1;
    }
    System.out.println("Key not found");
    }
} 