// Two sum problem using hashmap
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSum_1(arr,6)));
    }
    public static int[] twoSum(int[] nums, int target) {
            int[] ans = new int[2];
            HashMap <Integer, Integer> map = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                map.put(nums[i],i);
            }
            for(int i=0;i<nums.length;i++){
                int left = target-nums[i];
                if(map.containsKey(left) && map.get(left) != i){
                    ans[0] = i;
                    ans[1] = map.get(left);
                    break;
                }
            }
            return ans;
    }
    static int[] twoSum_1(int[] nums, int target){
        int[] ans = new int[2];
        int i=0,j=nums.length-1;
        while(i<=j){
            if(nums[i]+nums[j]==target){
                ans[0] = i;
                ans[1] = j;
            }
            i++;
            j--;
        }
        return ans;
    }
}
