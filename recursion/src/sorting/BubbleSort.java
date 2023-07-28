package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,5,4};
        bubbleSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr, int i, int n){
        if(n<1){
            return;
        }
        if(i<n){
            swap(arr,i,i+1);
            bubbleSort(arr,i+1,n);
        }else{
            bubbleSort(arr,0,n-1);
        }

    }
    static void swap(int[] arr, int start, int end){
        if(arr[start]>arr[end]){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }
    }
}
