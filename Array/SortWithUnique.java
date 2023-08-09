import java.util.ArrayList;

public class SortWithUnique {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(3);
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
