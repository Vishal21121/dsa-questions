import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement_2(arr));
    }

//    Better approach T.C O(nlogn + n) and S.C O(n)
    public static int majorityElement_1(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int length = nums.length/2;
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            int val = map.getOrDefault(nums[i],0);
            map.put(nums[i],val+1);
        }
        for(int el : map.keySet()){
            if(map.get(el)>length){
                ans =  el;
                break;
            }
        }
        return ans;
    }

//    Brute force approach: T.C O(n^2)
    static int majorityElement(int[] nums){
        int ans = -1;
        int target = nums.length/2;
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j = 0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>target){
                ans = nums[i];
                break;
            }
        }
        return ans;
    }

//    Optimal approach: O(n) if verification is not done and if verification is done then O(n) + O(n)
//    S.C => O(1)

    public static int majorityElement_2(int[] nums) {
        int el = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                el = nums[i];
                count++;
            }else if (el==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return el;
        // step for verifying whether this element is a majority element => not required in this question
        // int count_1 = 0;
        // for(int val: nums[i]){
        //     if(val == el ){
        //         count_1 ++;
        //     }
        // }
        // if(count_1 > nums.length/2){
        //     return el;
        // }else{
        //     return -1;
        // }
    }


}
