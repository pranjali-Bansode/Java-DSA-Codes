public class Kadanes_Algo {
   static int maxSubarraySum(int[] arr) {
      int max=arr[0];
      int res=arr[0];
      for(int i=1;i<arr.length;i++){
          max=Math.max(max+arr[i],arr[i]);
          res=Math.max(max,res);
      }
   return res;
    }
    public static void main(String args[]){
        int[] arr={1,2,3,-1,4,5,-7,4};
        int res=maxSubarraySum(arr);
        System.out.println(res);
    }
}
