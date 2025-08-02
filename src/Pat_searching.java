import java.util.ArrayList;

public class Pat_searching {
   static ArrayList<Integer> search(String pat, String txt) {
        // to store result
        ArrayList<Integer> res=new ArrayList<>();
        int n=txt.length();
        int m=pat.length();
        for(int i=0;i<=n-m;i++){
            // for checking pattern string
            int j=0;
            while(j<m && txt.charAt(j+i)==pat.charAt(j)){
                j++;
            }
            if(j==m){
                res.add(i);
            }
        }
   return res;
    }
    public static void main(String[] args) {
        String txt = "aabaacaadaabaaba";
        String pat = "aaba";

        ArrayList<Integer> res = search(pat, txt);
        for (int i = 0; i < res.size(); i++)
            System.out.print(res.get(i) + " ");
    }
}
