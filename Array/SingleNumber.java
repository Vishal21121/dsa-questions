//https://leetcode.com/problems/single-number/description/
//Single Number

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr= new int[]{1,1,2};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
