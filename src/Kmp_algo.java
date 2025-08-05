import java.util.ArrayList;

public class Kmp_algo {
    // function for prefix array
    static  void constructLps(String pat,int[] lps){
        // len stores the length of longest prefix which
        // is also a suffix for the previous index
        int len=0;
        int i=1;
        // lps[0] always 0
        lps[0]=0;
        while (i<pat.length()){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                lps[i]=0;
                i++;
            }
        }
    }
    static ArrayList<Integer> search(String pat, String txt){
        ArrayList<Integer> res=new ArrayList<>();
        int n=txt.length();
        int m=pat.length();
        int[] lps=new int[m];
        constructLps(pat,lps);
        // Pointers i and j, for traversing
        // the text and pattern
        int i=0;
      int  j=0;
      while(i<n){
          if(txt.charAt(i)==pat.charAt(j)){
              i++;
              j++;
              // If the entire pattern is matched
              // store the start index in result
              if(j==m){
                  res.add(i-j);
                  // Use LPS of previous index to
                  // skip unnecessary comparisons
                  j=lps[j-1];
              }
          }else{
              if(j!=0){
                  j=lps[j-1];
              }else{
                  i++;
              }
          }
      }
      return res;
    }
    public static void main(String args[]){
        String s="aabaacaadaabaaba";
        String pat="aaba";
        ArrayList<Integer> res=search(pat,s);
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
}
