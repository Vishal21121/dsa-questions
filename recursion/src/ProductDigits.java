public class ProductDigits {
    public static void main(String[] args) {
        System.out.println(product(10));
    }
    static int product(int n){
        int el;
        if(n==0){
            return 1;
        }
        el = n %10;
        n = n/10;
        return el * product(n);
    }
}
