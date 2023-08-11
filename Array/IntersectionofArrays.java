import java.util.ArrayList;

public class IntersectionofArrays {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(2);
        arr1.add(3);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        arr1.add(6);
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        arr2.add(2);
        arr2.add(3);
        arr2.add(3);
        arr2.add(5);
        arr2.add(6);
        arr2.add(6);
        arr2.add(7);

        System.out.println(findArrayIntersection(arr1,arr1.size(),arr2,arr2.size()));
    }
    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> nums1, int n, ArrayList<Integer> nums2, int m)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] arr = new int[nums2.size()];
        for(int i=0;i<nums1.size();i++){
            for(int j=0;j<nums2.size();j++){
                if(nums1.get(i) == nums2.get(j) && arr[j] == 0){
                    list.add(nums1.get(i));
                    arr[j] = 1;
                    break;
                }else if(nums2.get(j)>nums1.get(i)){
                        break;
                }
            }
        }
        return list;
    }
}
