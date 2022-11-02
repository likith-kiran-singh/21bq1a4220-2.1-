//creating MergeSort class 
public class MergeSort {
//creating mergesort method which is passed with array b,lower bound,upper bound
    void mergeSort(int b[],int lb,int ub) {
        int mid;
//As long as the lower bound not exceeds upper bound,the if block executes.
        if(lb!=ub) {
//mid is calculated on the average of the both bounds
            mid=(lb+ub)/2;
//upper bound is replaced with mid value
            mergeSort(b,lb,mid);
//lower bound is replaced with mid+1 th value
            mergeSort(b,mid+1,ub);
//Mergesort method is called which is passed with array,low,mid,high values
            Mergesort(b,lb,mid,ub);
            }
            }
//creating Mergesort method with passing of array,lower bound,mid value, upper bound            
    static void Mergesort(int c[],int lb,int mid,int ub) {
        int i,j,k; 
        int temp[]=new int[20];
        i=lb;j=mid+1; k=lb;

        while((i<=mid)&&(j<=ub)) {
           if(c[i]<c[j])
                temp[k++]=c[i++];
            else
                temp[k++]=c[j++];
        }
        while(i<=mid)
            temp[k++]=c[i++];
        while(j<=ub)
            temp[k++]=c[j++];
        for(i=lb;i<=ub;i++)
            c[i]=temp[i];
        } 
}
