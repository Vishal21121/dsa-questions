package arrays;

public class SortedArray {
    public static void main(String[] args) {
        System.out.println(checkSortedArray(new int[]{2,1,3,4},0));
    }
    static boolean checkSortedArray(int[] arr, int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return checkSortedArray(arr,index+1);
    }
}
