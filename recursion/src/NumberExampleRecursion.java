// converting the NumberExample Program in recursion

public class NumberExampleRecursion {
    public static void main(String[] args) {
            number(1);
    }
//    In the NumberExample program same the function was created again and again just nane of the function was different, so we can improve that by creating the function once and slightly modifying the body for the condition that it should stop the calling the function when the value of n==5
    static void number(int n){
        if(n==5){   // base condition
            System.out.println(n);
            return;
        }
        System.out.println(n);
//        this is tail recursion
//        tail recursion: when a recursive function is the last statement of that function then it is called tail recursion.
        number(n+1);
    }

}
