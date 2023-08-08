// number whose difference between the digits is equal to 1

import java.util.ArrayList;
import java.util.Arrays;

public class DancingNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dancingNum(105)));
    }
    static int[] dancingNum(int limit){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<=limit;i++){
            boolean isNumber = isDancingNumber(i);
            if(isNumber){
                list.add(i);
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static boolean isDancingNumber(int number) {
        String numberString = String.valueOf(number);

        for (int i = 0; i < numberString.length() - 1; i++) {
            int digit1 = Character.getNumericValue(numberString.charAt(i));
            int digit2 = Character.getNumericValue(numberString.charAt(i + 1));

            if (Math.abs(digit1 - digit2) != 1) {
                return false;
            }
        }

        return true;
    }

}
