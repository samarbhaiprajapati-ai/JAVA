package Array;

import java.util.Scanner;

public class demo {
    static void main() {
//       int a[] = {4,9,6,5,6,7,4,9,6,3};
//        System.out.println(a[6]);
//
//        a[6] = a[6] * 10;
//        System.out.println(a[6]);
//        int[] arr = new int[5]; // 0 to 4 indexes
//        arr[0] = 4;
//        arr[1] = 2;
//        arr[2] = 7;
//        arr[3] = 67;
//        arr[4] = 5;
//
//
//        for(int i = 0;i< arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }
        int n;
        Scanner z = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        n = z.nextInt();
int[] arr = new int[n];
int i = 0;

while (i < n)
{

    arr[i] = z.nextInt();
    i++;
}
        for (int j = 0; j < n; j++) {
            System.out.println(2 * arr[j]);

        }
    }

}
