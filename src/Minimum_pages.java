import java.util.Arrays;

public class Minimum_pages {
    public static boolean check(int[] arr,int k,int pageLimit){
        // for tracking count
      int cnt=1;
      int page=0;
      for(int i=0;i<arr.length;i++){
          if(page+arr[i]>pageLimit){
              page=arr[i];
              cnt++;
          }else{
              page+=arr[i];
          }
      }
      return (cnt<=k);
    }
    public static  int findPages(int[] arr, int k) {
        // if student is greater than number of books
        if(arr.length<k){
            return -1;
        }
        // using binary search
        int res=-1;
        int low= Arrays.stream(arr).max().getAsInt();
       int hi=Arrays.stream(arr).sum();
       while(low<=hi){
           int mid=low+(hi-low)/2;
           if(check(arr,k,mid)){
               hi=mid-1;
               res=mid;
           }
               low=mid+1;
           }
        return res;
       }


    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int k = 2;
        System.out.println(findPages(arr, k));
    }
}
