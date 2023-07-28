public class PassingNumber {
    public static void main(String[] args) {
      sum(5);
    }
    static void sum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
    //        if we pass n-- then it will always print 5 and will lead to stackoverflow because n-- will pass the value of n and then it will subtract but as we have passed n so it will behave for n and then in next turn it will again call n-- so as a result value of n will never decrease resulting in an infinite loop
//        sum(n--);

        sum(--n);
    }
}
