import java.util.Arrays;

public class nthLargest {
    static int findNthLargest(int arr[],int n){
        Arrays.sort(arr);
        return arr[arr.length-n];
    }
    public static void main(String[] args) {
        int arr[]={50,20,40,18,30,60,78,38};
        int result=findNthLargest(arr, 4);
        System.out.println(result);
    }
}
