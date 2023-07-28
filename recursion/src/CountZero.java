public class CountZero {
    public static void main(String[] args) {
        System.out.println(counter(3020010,0));
    }
    static int counter(int n, int count){
        if(n==0){
            return count;
        }
        int rem = n%10;
        if(rem==0){
            ++count;
        }
        return counter(n/10,count);
    }
}
