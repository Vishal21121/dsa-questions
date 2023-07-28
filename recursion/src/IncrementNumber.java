// print number from 1 to n
public class IncrementNumber {
    public static void main(String[] args) {
        increment1(1);
    }

//    method - 1
    static void increment(int start, int end){
        if(start==end){
            System.out.println(start);
            return;
        }
        System.out.println(start);
        increment(start+1,end);
    }

//    method - 2
    static void increment1(int end){
        if(end==0){
            return;
        }
        increment1(end-1);
        System.out.println(end);
    }

}
