package Array;

public class passarraytofun {
    public static void x(int[] a)
    {
        a[3] = 1111;
    }
    static void main(String[] args) {
        int[] z = {1,2,3,4,5};
        x(z);
        for (int i = 0; i < 5; i++) {
            System.out.print(z[i]+ " ");
        }
    }
}
