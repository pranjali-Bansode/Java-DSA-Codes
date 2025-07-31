import java.util.Arrays;

public class Merge_Two_Sorted_Array {
    public static void mergeArrays(int a[], int b[]) {
       int n=a.length;
       int m=b.length;
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               if(b[j]<a[i]){
                   int temp=a[i];
                   a[i]=b[j];
                   b[j]=temp;
                   Arrays.sort(b);
               }
           }
       }

    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String args[]){
        int[] arr={1,3,5,7};
        int[] arr2={2,4,6};
        mergeArrays(arr,arr2);
        System.out.println("For arr1");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("For arr2");
        for(int i=0;i<arr2.length;i++){
            System.out.print(" "+arr2[i]);
        }

    }
}
