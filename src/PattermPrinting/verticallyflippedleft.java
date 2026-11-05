package PattermPrinting;

import java.util.Scanner;

public class verticallyflippedleft {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n;
        System.out.println("Enter The Number: ");

        n = x.nextInt();


        for(int i = 1;i <= n;i++)
        {


            for(int j = 1;j <= i - 1;j++)
            {

                System.out.print("  ");


            }
            for(int k = 1; i + k <= n + 1; k++)
            {

                System.out.print("*" + " ");

            }

            System.out.println( );
        }
    }
}
