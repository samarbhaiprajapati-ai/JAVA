package Array;

public class oddeven {
    public static  void change(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            if(i % 2 == 0) a[i] = a[i] + 10;
            else a[i] *= 2;

        }
    }
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        change(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
