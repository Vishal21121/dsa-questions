import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeftRotateByDPlace {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotate_2(arr,arr.length,3)));
    }

//    approach - 1 (Brute force) T.C => O(d) + O(n-d) + O(d) => O(n+d). S.C => O(d)
    static int[] rotate(int[] arr, int n, int d){
//        creating this arraylist for storing the values which needs to be shifted.
        ArrayList<Integer> list = new ArrayList<>();

//        we know that if we rotate the array n times then after rotation original array will be generated.
//        for ex: if d = 7 and n =7 then after rotation original array will be generated.
//        know if d = 15 => 7 + 7 + 1 so here we get multiple of 7 means after two complete rotation same array will be there and the remaining 1 which is the effective number which we have to shift
//        therefore the elements which we have to shift is d % n (d=15, n= 7) 1 element is to be rotated
        d = d % n;

//        adding the elements in the arraylist
        for(int i=0;i<d;i++){
            list.add(arr[i]);
        }
//            shifting the elements from the d position
        for(int i=d;i<n;i++){
            arr[i-d] = arr[i];
        }

//        adding the arraylist values at the end of the array arr.
        for(int i=n-d;i<n;i++){
            arr[i] = list.get(i-(n-d));
        }
        return arr;
    }
//    approach - 2 Optimal solution T.C O(d) + O(n-d) + O(n) => O(2n), S.C O(1)

    static int[] rotate_2(int[] arr, int n, int d){
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
        reverseArray(arr,0,n-1);
        return arr;
    }

    static void reverseArray(int[] arr, int start, int end){
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end --;
        }
    }

}
