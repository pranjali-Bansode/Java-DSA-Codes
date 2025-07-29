public class Majority_Element {
    static int majorityElement(int arr[]) {
        int size=arr.length;
    int cand= findCandidate(arr,size);
    if(isMajority(arr,cand,size)){
        return cand;
    }
    return -1;
    }
    public static int findCandidate(int[] arr,int size){
        int maj_idx=0,count=1;
        for(int i=1;i<size;i++){
            if(arr[maj_idx]==arr[i]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                maj_idx=i;
                count=1;
            }
        }
        return arr[maj_idx];
    }
    public static boolean isMajority(int[] arr,int candidate,int size){
        int c=0;
        for(int i=0;i<size;i++){
            if(arr[i]==candidate){
                c++;
            }
        }
        return c>size/2;
    }
    public static void main(String args[]){
        int[] arr={1,2,1,2,2,2,4};
        int res=majorityElement(arr);
        System.out.println(res);
    }
}
