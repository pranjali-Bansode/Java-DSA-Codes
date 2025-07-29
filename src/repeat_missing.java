import java.util.ArrayList;

public class repeat_missing {
   static ArrayList<Integer> findTwoElement(int arr[]) {
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        int[] temp=new int[n+1];
        for(int i=0;i<n;i++){
            int x=arr[i];
            if(temp[x] !=1){
                temp[x]=1;
            }else{
                res.add(x);
            }
        }
        for(int i=1;i<=n;i++){
            if(temp[i]==0){
                res.add(i);
            }
        }
  return res;
    }
    public static void main(String args[]){
        int[] arr={1,2,3,3,4,5};
        ArrayList<Integer> res=findTwoElement(arr);
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
}
