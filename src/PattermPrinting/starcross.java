package PattermPrinting;

import java.util.Scanner;

public class starcross {
    static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int n;
        System.out.print("Enter Rows: ");
        n = x.nextInt();



        for(int i = 1;i <= n;i++)
        {
            for(int j = 1;j <= n;j++)
            {
                if(i == j || i + j == n + 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
