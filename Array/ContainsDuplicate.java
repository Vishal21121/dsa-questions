import java.util.ArrayList;
import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,1,3};
        System.out.println(containsDuplicate(arr));
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

    public boolean containsDuplicate_1(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])!=null){
                return true;
            }else{
                map.put(arr[i],i);
            }
        }
        return false;
    }

}
