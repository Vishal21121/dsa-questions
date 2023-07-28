package arrays;

import java.util.ArrayList;

public class DuplicateElementLinearSearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(search(new int[]{1,8,2,3,4,4,8},0,8,list));
    }
    static ArrayList<Integer> search(int[] arr, int index, int target, ArrayList<Integer> list){
        if(arr[index]==target){
            list.add(index);
        }
        if(index == arr.length-1){
            return list;
        }

        return search(arr,index+1,target,list);
    }
}
