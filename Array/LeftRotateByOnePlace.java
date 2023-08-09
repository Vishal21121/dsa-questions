import java.util.Arrays;

public class LeftRotateByOnePlace{
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(rotateArray(arr,arr.length)));
    }
    static int[] rotateArray(int[] arr, int n) {
        // storing the first element in temp
        int temp = arr[0];
        // shifting all the elements towards left
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        // finally placing the first element at the last position.
        arr[n-1] = temp;
        return arr;
    }
}