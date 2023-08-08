public class ArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = new int[]{90, 80, 100, 70, 40, 30};
        System.out.println(arraySortedOrNot(arr,0,arr.length-1));
    }
//    Recursive method
    static boolean arraySortedOrNot(int[] arr, int start, int n) {
        if(start>=n){
            return true;
        }
        if(arr[start]>arr[start+1]){
            return false;
        }
        return arraySortedOrNot(arr,start+1,n);
    }

//    Iterative method

   static boolean arraySortedOrNot_1(int[] arr, int n) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
   }
}
