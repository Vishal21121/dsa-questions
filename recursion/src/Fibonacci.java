public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
    static int fibo(int n){
        if(n<=1){
            return n;
        }
//        this is not tail recursion as we are not having the function fibo(n) as the last statement to be executed.
        return fibo(n-1) + fibo(n-2);
    }

}
