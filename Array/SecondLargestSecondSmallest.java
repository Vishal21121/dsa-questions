// question link: https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-elements_6581960?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems&leftPanelTab=0

public class SecondLargestSecondSmallest {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5 };
        int slargest = sLargest(arr,arr.length);
        int ssmallest = sSmalest(arr,arr.length);
        System.out.println(slargest + " " + ssmallest);
    }
    static int sLargest(int[] arr,int n){
        // approach - 1 time complexity O(nlogn + n)
        // Arrays.sort(arr);
        // int max = arr[n-1];
        // for(int i=n-2;i>=0;i--){
        //     if(arr[i]<max){
        //         return arr[i];
        //     }
        // }
        // return -1;

        // approach - 2 time complexity O(n+n)
//        int maxIndex = 0, slargest = -1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>arr[maxIndex]){
//                maxIndex = i;
//            }
//        }
//        for(int i=n-1;i>=0;i--){
//            if(arr[i]!=arr[maxIndex] && arr[i]>slargest){
//                slargest = arr[i];
//            }
//        }
//        return slargest;

//        approach - 3 time complexity O(n)
        int largest = -1, slargest = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            }else{
                if(arr[i] != largest && arr[i]>slargest){
                    slargest = arr[i];
                }
            }
        }
        return slargest;
    }

    static int sSmalest(int[] arr,int n){
        // approach - 1 time complexity O(nlogn + n)
        // Arrays.sort(arr);
        // int min = arr[0];
        // for(int i=1;i<n;i++){
        //     if(arr[i]>min){
        //         return arr[i];
        //     }
        // }
        // return -1;

        // approach - 2 time complexity O(n+n)
//        int minIndex = 0, ssmalestIndex, maxIndex = 0;
//        for(int i=1;i<n;i++){
//            if(arr[i]<arr[minIndex]){
//                minIndex = i;
//            }
//            if(arr[i]>arr[maxIndex]){
//                maxIndex = i;
//            }
//        }
//        ssmalestIndex = maxIndex;
//        for(int i=0;i<n;i++){
//            if(arr[i]!=arr[minIndex] && arr[i] < arr[ssmalestIndex] ){
//                ssmalestIndex = i;
//            }
//        }
//
//        return arr[ssmalestIndex];

//        approach - 3 time complexity O(n)
        int smallest = arr[0],ssmalest = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                ssmalest = smallest;
                smallest = arr[i];
            }else{
                if(arr[i] != smallest && arr[i]<ssmalest){
                    ssmalest = arr[i];
                }
            }
        }
        return ssmalest;

    }
}
