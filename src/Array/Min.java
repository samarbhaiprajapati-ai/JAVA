package Array;

import java.util.Scanner;

public class Min {
    static void main(String[] args) {
        int n,min;
        System.out.print("Enter The Length: ");
        Scanner x = new Scanner(System.in);
        n = x.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print(i+1+"Th Element: ");
            arr[i] = x.nextInt();


        }
        min = arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i] < min) min = arr[i];

        }
        System.out.println("Max =  "+ min);
    }

}
