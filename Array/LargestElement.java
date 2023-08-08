public class LargestElement {
    public static void main(String[] args) {
        int[] arr = new int[]{5,4,3,2,1};
        System.out.println(largestElement(arr,arr.length));
    }
    static int largestElement(int[] arr, int n) {
        // Write your code here.

        // brute force approach
        //  Arrays.sort(arr);
        //  return arr[n-1];

        //  optimal approach
        int maxIndex = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[maxIndex]){
                maxIndex = i;
            }
        }
        return arr[maxIndex];

    }
}
