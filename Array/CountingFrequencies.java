import java.util.ArrayList;
import java.util.HashMap;

public class CountingFrequencies {
    public static void main(String[] args) {
        int[] arr = new int[]{10,5,6,3,8,1,1,8,2,1,5,10,9,4};
        System.out.println(countFreq(arr));
    }
    static ArrayList<Integer> countFreq(int[] arr)
    {
        int count;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])!=null){
                continue;
            }else{
                map.put(arr[i],i);
            }
            count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            sum+=count;
            list.add(sum);
        }
        return list;
    }
}
