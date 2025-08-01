import java.util.HashMap;

public class single_number_II {
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num, (map.getOrDefault(num,0)+1));
        }
        for(int key: map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr={1,2,1,1};
        long result=singleNumber(arr);
        System.out.println(result);

    }
}
