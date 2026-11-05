package PattermPrinting;

import java.util.Scanner;

public class spacetri2 {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n;
        System.out.println("Enter The Number: ");

        n = x.nextInt();


        for(int i = 1;i <= n;i++)
        {


            for(int j = 1;i+j <= n;j++)
            {

                    System.out.print("  ");


            }
            for(int k = 1; k <= i; k++)
            {

                  System.out.print("*" + " ");

            }

            System.out.println( );
        }
    }
}
