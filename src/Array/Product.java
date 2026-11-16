package Array;

import java.util.Scanner;

public class Product {
    static void main(String[] args) {
        int n,P  = 1;
        System.out.print("Enter The Length: ");
        Scanner x = new Scanner(System.in);
        n = x.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print(i+1+"Th Element: ");
            arr[i] = x.nextInt();
            P  = P * arr[i];

        }
        System.out.println("Product Of Elements : "+ P);
    }
    }

