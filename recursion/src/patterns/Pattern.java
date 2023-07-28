package patterns;

//        *****
//        ****
//        ***
//        **
//        *

public class Pattern {
    public static void main(String[] args) {
        pattern2(1,1,5);
    }
    static void pattern1(int r, int c, int n){
        if(r>n){
            return;
        }
        if(c<=n-r+1){
            System.out.print("*");
            pattern1(r,c+1,n);
        }else{
            System.out.println();
            pattern1(r+1,1,n);
        }

    }
    static void pattern2(int r, int c, int n){
        if(r>n){
            return;
        }
        if(c<=r){
            System.out.print("*");
            pattern2(r,c+1,n);
        }else{
            System.out.println();
            pattern2(r+1,1,n);
        }

    }
}
