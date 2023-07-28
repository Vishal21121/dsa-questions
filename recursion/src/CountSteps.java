public class CountSteps {
    public static void main(String[] args) {
        System.out.println(stepsCount(5));
    }
    static int stepsCount(int n){
        return helper(n,0);
    }
    static int helper(int n, int count){
        if(n==0){
            return count;
        }
        if(n%2==0){
            ++count;
            return helper(n/2,count);
        }else{
            ++count;
            return helper(n-1,count);
        }
    }
}
