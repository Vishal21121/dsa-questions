public class ReverseSum {
    public static void main(String[] args) {
        System.out.println(sumReverse(5));
    }
    static int sumReverse(int n){
        if(n==1){
            return 1;
        }
        return n + sumReverse(n-1);
    }
}
