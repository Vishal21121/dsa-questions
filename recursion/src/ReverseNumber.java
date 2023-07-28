import java.lang.Math;
public class ReverseNumber {
    public static void main(String[] args) {
//        System.out.println(reverseNum1(12345,0));
        System.out.println(reverseNum2(12345,5));
    }
//    first method
    static int reverseNum1(int n, int reversedNum){
        int el;
        if(n==0){
            return reversedNum;
        }
        el = n%10;
        reversedNum = reversedNum * 10 + el;
        n =   n/10;
        return reverseNum1(n,reversedNum);
    }
//    2nd method
    static int reverseNum2(int n, int digits){
        int rem;
        if(n%10==0){
            return n;
        }
        rem = n%10;
//       here we are multiplying the remainder with the 10^number of digits - 1
        return rem * (int)(Math.pow(10,digits-1)) + reverseNum2(n/10,digits-1);
    }
}
