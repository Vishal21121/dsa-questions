public class SumDigits {
    public static void main(String[] args) {
        int val = sum(1342);
        System.out.println(val);
    }
    static int sum(int n){
        int el;
        if(n==0){
            return n;
        }
        el = n %10;
        n = n/10;
        return el + sum(n);
    }
}
