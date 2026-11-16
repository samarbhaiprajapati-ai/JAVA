package Array;

import java.util.Scanner;

public class eleSum {
    static void main(String[] args) {
        int n,Sum  = 0;
        System.out.print("Enter The Length: ");
        Scanner x = new Scanner(System.in);
        n = x.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print(i+1+"Th Element: ");
            arr[i] = x.nextInt();
            Sum  = Sum + arr[i];

        }
        System.out.println("Sum Of Elements : "+ Sum);
    }}
