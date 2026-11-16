package Array;

import java.util.Scanner;

public class Max {
    static void main(String[] args) {
        int n,max;
        System.out.print("Enter The Length: ");
        Scanner x = new Scanner(System.in);
        n = x.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print(i+1+"Th Element: ");
            arr[i] = x.nextInt();


        }
        max = arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i] > max) max = arr[i];

        }
        System.out.println("Max =  "+ max);
    }
}
