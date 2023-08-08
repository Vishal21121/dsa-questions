public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,3};
        System.out.println(sum_1(arr,arr.length-1));
    }

//    recursive approach
    static int sum(int[] arr,int index, int sumVal, int n) {
        if(index>n){
            return sumVal;
        }
        sumVal += arr[index];
        return sum(arr,index+1,sumVal,n);
    }

//    Iterative approach
    static int sum_1(int[] arr, int n) {
        int sumVal = 0;
        for(int el: arr){
            sumVal += el;
        }
        return sumVal;
    }

}
