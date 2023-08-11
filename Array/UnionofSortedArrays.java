import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UnionofSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5,1,2,3,4,5};
        int[] arr2 = new int[]{5,6,7};
        System.out.println(sortedArray(arr1,arr2));
    }
    public static List< Integer > sortedArray(int []a, int []b) {
        List<Integer> list = new ArrayList<>();
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                if(list.size()==0 || list.get(list.size()-1)!=a[i]){
                    list.add(a[i]);
                }
                i++;
            }else{
                if(list.size()==0 || list.get(list.size()-1)!=b[j]){
                    list.add(b[j]);
                }
                j++;
            }
        }
        while(i<a.length){
            if(list.get(list.size()-1)!=a[i]){
                list.add(a[i]);
            }
            i++;
        }
        while(j<b.length){
            if(list.get(list.size()-1)!=b[j]){
                list.add(b[j]);
            }
            j++;
        }
        return list;
    }
}
