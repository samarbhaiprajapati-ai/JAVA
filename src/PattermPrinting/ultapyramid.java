package PattermPrinting;

import java.util.Scanner;

public class ultapyramid {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n,a = 1;
        System.out.println("Enter The Number: ");

        n = x.nextInt();

        a = (2 * n) - 1;
        for(int i = 1;i <= n;i++)
        {


            for(int j = 1;j <= i - 1;j++)
            {

                System.out.print("  ");


            }
            for(int k = a;k >= 1; k--)
            {

                System.out.print("*" + " ");

            }

            System.out.println( );
            a = a - 2;
        }
    }
}
