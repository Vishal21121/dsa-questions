// print number from n to 1
public class DecrementNumber {
    public static void main(String[] args) {
        printer(10);
    }
    static void printer(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printer(n-1);
    }
}
