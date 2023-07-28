public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(1));
    }
    static boolean palindrome(int n){
        return reverseNum(n,(int)(Math.log10(n))+1) == n;
    }

    private static int reverseNum(int n,int digits) {
        int el;
        if(n%10==0){
            return n;
        }
        el = n%10;
        return el * (int)(Math.pow(10,digits-1)) + reverseNum(n/10,digits-1);
    }
}
