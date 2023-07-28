public class NumberExample {
    public static void main(String[] args) {
        number(1);
    }
    static void number(int n){
        System.out.println(n);
        number1(n+1);
    }
    static void number1(int n){
        System.out.println(n);
        number2(n+1);
    }
    static void number2(int n){
        System.out.println(n);
        number3(n+1);
    }
    static void number3(int n){
        System.out.println(n);
        number4(n+1);
    }
    static void number4(int n){
        System.out.println(n);
    }
}
