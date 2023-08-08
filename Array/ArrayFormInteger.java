//989. Add to Array-Form of Integer
//https://leetcode.com/problems/add-to-array-form-of-integer/description/
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFormInteger {
    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3},806));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List <Integer> list = new ArrayList<Integer>();
       StringBuilder builder = new StringBuilder();
        BigInteger firstEl;
       BigInteger totalVal;
       for(int el: num){
           builder.append(el);
       }
        System.out.println(builder);
       firstEl = new BigInteger(builder.toString());
       totalVal = firstEl.add(BigInteger.valueOf(k));
       String valString = String.valueOf(totalVal);
       for(int i=0;i<valString.length();i++){
           list.add(Integer.parseInt(Character.toString(valString.charAt(i))));
       }
       return list;

    }
}
