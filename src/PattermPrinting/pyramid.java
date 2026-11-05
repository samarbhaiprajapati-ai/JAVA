package PattermPrinting;

import java.util.Scanner;

public class pyramid {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n,a = 1;
        System.out.println("Enter The Number: ");

        n = x.nextInt();


        for(int i = 1;i <= n;i++)
        {


            for(int j = 1;i+j <= n;j++)
            {

                System.out.print("  ");


            }
            for(int k = 1; k <= a; k++)
            {

                System.out.print(i + " ");

            }

            System.out.println( );
            a = a + 2;
        }
    }
}
