import java.util.HashMap;
import java.util.HashSet;

public class longestConsecutive {
    public static int longestConsecutive1(int[] arr) {
        int res=0;
       int n=arr.length;
        HashSet<Integer> set=new HashSet<>();
        for(int val:arr){
            set.add(val);
        }
        for(int val:arr){
            if(set.contains(val) && !set.contains(val-1)){
                int cur=val;
                int cnt=0;
                while(set.contains(cur)){
                    set.remove(cur);
                    cur++;
                    cnt++;
                }
                res=Math.max(cnt,res);
            }
        }
        return res;
       }
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 9, 4, 5, 3};
        System.out.println(longestConsecutive1(arr));
    }
    }

