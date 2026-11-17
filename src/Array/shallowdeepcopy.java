package Array;

import java.util.Arrays;

public class shallowdeepcopy {
    public static void print(int[] x)
    {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        Arrays.sort(x);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
    static void main(String[] args) {
//        int[] a = {1,2,3,4,5,6,667};
//
//        int[] ar  =  a;
//        System.out.println(ar[6]); shallo
//        int[] a = {1,2,3,4,5,6,667};
//        int[] ar = Arrays.copyOf(a,a.length);
//        a[6] = 4;
//        System.out.println(ar[6]);
        int[] arr = {6,8,3,-9,0};
        print(arr);

    }
}
