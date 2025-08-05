public class repeated_string {
    static int repeatedStringMatch(String a, String b) {
      StringBuilder repeated =new StringBuilder();
      int count=0;
      int n=a.length();
      int m=b.length();
      while(repeated.length()<m){
          repeated.append(a);
          count++;
      }
      if(repeated.toString().contains(b)){
          return count;
      }
      repeated.append(a);
      count++;
        if(repeated.toString().contains(b)){
            return count;
        }

return count;
    }
    public static void main(String args[]){
        String a="abcd";
        String b="cdabcdab";
        int result=repeatedStringMatch(a,b);
        System.out.println(result);
    }
}
