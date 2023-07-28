public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,44,50,77};
        System.out.println(BS(arr,3,0,arr.length-1));
    }
    static int BS(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            return BS(arr,target,mid+1,end);
        }else{
            return BS(arr,target,start,mid-1);
        }


    }
}
