package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{8,3,4,12,5,6};

        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);

    }
    static int[] merge(int[] arr1, int[] arr2){
        int i=0,j=0, k=0;
        int[] result = new int[arr1.length+arr2.length];
        while (i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                result[k] = arr1[i];
                k++;
                i++;
            }else{
                result[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length){
            result[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            result[k]=arr2[j];
            j++;
            k++;
        }
        return result;
    }
}
