package Array;

import java.util.Scanner;

public class negative {
    static void main(String[] args) {
        int n;
        System.out.print("Enter The Length: ");
        Scanner x = new Scanner(System.in);
        n = x.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print(i+1+"Th Element: ");
            arr[i] = x.nextInt();

        }
        for (int i = 0; i < n; i++) {
            if(arr[i] < 0)
                System.out.println(arr[i]);
        }
    }
}
