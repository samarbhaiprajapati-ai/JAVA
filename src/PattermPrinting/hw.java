package PattermPrinting;

import java.util.Scanner;

public class hw {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n;
        System.out.print("Enter Rows: ");
        n = x.nextInt();



        for(int i = 1 ;i <= n ;i++)
        {
            for(int j = 1 ;j <= n;j++)
            {
                if(i % 2 != 0)
                    System.out.print((char)(i+96) + " ");
                else
                    System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
    }
}
