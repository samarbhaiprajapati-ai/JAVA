package PattermPrinting;

import java.util.Scanner;

public class AAAAsquare {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n;
        System.out.print("Enter Rows: ");
        n = x.nextInt();



        for(int i = 1 + 64;i <= n + 64;i++)
        {
            for(int j = 1 + 64;j <= n + 64;j++)
            {
                System.out.print((char)i + " ");
            }
            System.out.println();
        }
    }
}
