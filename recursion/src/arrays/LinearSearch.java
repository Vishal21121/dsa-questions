package arrays;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,2,5,4},4,0));
    }
    static int search(int[] arr, int target, int index){


        if(arr[index]==target){
            return index;
        }
        if(index == arr.length-1){
            return -1;
        }
        return search(arr,target,index+1);
    }
}
