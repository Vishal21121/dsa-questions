import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        sort012(new int[]{0,2,1,2,0},5);
    }
    public static void sort012(int a[], int n)
    {
        Arrays.sort(a);
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+ " ");
        }
    }
}
