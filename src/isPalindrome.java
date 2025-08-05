public class isPalindrome {
    public static boolean isPalinSent(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            } else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            } else if (Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))) {
                i++;
                j--;
                
            }else{
                return false;
            }
        }
  return true;
    }
    public static void main(String args[]){
        String s = "Too hot to hoot.";
        System.out.println(isPalinSent(s)
                ? "true" : "false");
    }
}
