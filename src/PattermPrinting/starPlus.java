package PattermPrinting;

import java.util.Scanner;

public class starPlus {
    static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int n;
        System.out.print("Enter Rows: ");
        n = x.nextInt();
        int mid = (1 + n) / 2;


        for(int i = 1;i <= n;i++)
        {
            for(int j = 1;j <= n;j++)
            {
                if(i == mid || j == mid)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
