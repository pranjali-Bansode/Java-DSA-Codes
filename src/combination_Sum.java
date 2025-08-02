import java.util.ArrayList;
import java.util.Arrays;

public class combination_Sum {
    // Function to find all combinations of elements
    public static void makeCombination(int[] arr,int remsum,
ArrayList<Integer> curr,ArrayList<ArrayList<Integer>> res, int index){
        if(remsum==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(remsum<0 || index>=arr.length){
            return;
        }
        // Include current element
        curr.add(arr[index]);
        makeCombination(arr,remsum-arr[index],curr,res,index);
        // Backtrack
        curr.remove(curr.size()-1);
        // Exclude current element and move forward
        makeCombination(arr,remsum,curr,res,index+1);

    }
    static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int target) {
        Arrays.sort(arr);
        ArrayList<Integer> curr=new ArrayList<>();
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        makeCombination(arr,target,curr,res,0);
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int target = 8;

        ArrayList<ArrayList<Integer>> res = combinationSum(arr, target);

        for (ArrayList<Integer> v : res) {
            for (int i : v) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
