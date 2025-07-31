public class Max_product {
     static int maxProduct(int[] arr) {
        int max=arr[0];
        int min=arr[0];
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }

            max=Math.max(max*arr[i],arr[i]);
            min=Math.min(arr[i]*min,arr[i]);
            res=Math.max(max,res);
        }
        return res;
    }
    public static void main(String args[]){
        int[] arr={-2, 6, -3, -10, 0, 2};
        int res=maxProduct(arr);
        System.out.println(res);
    }

    }

