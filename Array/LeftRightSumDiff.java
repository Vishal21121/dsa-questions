import java.util.Arrays;

public class LeftRightSumDiff {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRigthDifference(new int[]{10,4,8,3})));
    }
    public static int[] leftRigthDifference(int[] nums) {
        // created the final array
        int[] arr = new int[nums.length];
        // created the leftSum array
        int[] leftSum = new int[nums.length];
        // created the rightSum array
        int[] rightSum = new int[nums.length];
        // filling the element in the leftSum array
        for(int i=1;i<leftSum.length;i++){
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }
        // filling the element in the rightSum array
        for(int i=nums.length-2;i>=0;i--){
            rightSum[i] = rightSum[i+1] + nums[i+1];
        }
        // filling the elements in tha arr while taking the postive value in subtraction of elements of leftSum and rightSum
        for(int i=0;i<arr.length;i++){
            arr[i] = Math.abs(leftSum[i]-rightSum[i]);
        }
        return arr;
    }
}
