package sorting;

import java.util.Arrays;

//import static sorting.BubbleSort.swap;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{};
        selectionSort(arr,0,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr, int start,int n,int max){
        if(n<1){
            return;
        }
        if(start<n){
            if(arr[start]>arr[max]){
                selectionSort(arr,start+1,n,start);
            }else{
                selectionSort(arr,start+1,n,max);
            }
        }
        swap(arr,max,n);
        selectionSort(arr,0,n-1,0);
    }

    static void swap(int[] arr, int start, int end){
        if(arr[start]>arr[end]){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }
    }
}
