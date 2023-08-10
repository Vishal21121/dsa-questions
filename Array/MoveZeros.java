import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = new int[]{0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

//    optimal approach
    static void moveZeroes_2(int[] nums) {
        int zeroIndex = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroIndex = i;
                break;
            }
        }
        if(zeroIndex==-1){
            return;
        }
        for(int i=zeroIndex+1;i<nums.length;i++){
            if(nums[i]!=0){
                swap(nums,zeroIndex,i);
                zeroIndex++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


//    better approach
    static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        for(int i=nonZeroIndex;i<nums.length;i++){
            nums[i] = 0;
        }
    }

//    brute force approach
    static void moveZeroes_1(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                list.add(nums[i]);
            }
        }
        int size = list.size();
        for(int i=0;i<list.size();i++){
            nums[i] = list.get(i);
        }
        for(int i=size;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}
