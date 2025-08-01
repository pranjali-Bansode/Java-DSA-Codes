import java.util.Arrays;

public class single_number {
    static int getSingle(int arr[]) {

        Arrays.sort(arr);  // Sort the array first
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];  // Found the unique element
            }
        }
        return arr[arr.length - 1];
    }
    public static void main(String args[]){
        int[] arr={28596, 17413, 1209, 17413, 28596, 1209, 3296};
        long result=getSingle(arr);
        System.out.println(result);

    }
}
