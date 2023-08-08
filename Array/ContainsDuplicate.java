import java.util.ArrayList;

public class ContainsDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println(remove_2(arr,arr.size()));
    }

//    if creating new array is allowed
    public static boolean containsDuplicate(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int el:nums){
            if(list.indexOf(el)!=-1){
                return true;
            }
            list.add(el);
        }
        return false;
    }

//    if creating new array is not allowed
        static int remove_2(ArrayList<Integer> arr, int n){
            int uniqueIndex = 0;
            for(int i=1;i<n;i++){
                if(arr.get(i)!=arr.get(uniqueIndex)){
                    arr.set(uniqueIndex+1,arr.get(i));
                    uniqueIndex = uniqueIndex + 1;
                }
            }
            return uniqueIndex+1;
        }
}
