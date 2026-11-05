package PattermPrinting;

import java.util.Scanner;

public class diamond {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n,nst,nsp;
        System.out.print("Enter The Number: ");

        n = x.nextInt();
        nsp = n - 1;
        nst= 1;

        for(int i = 1;i <= n;i++)
        {
            for(int j = nsp;j > 0;j--)
                {

                    System.out.print("  ");


                }
                for(int k = 1; k <= nst; k++)
                {

                    System.out.print("*"+ " ");

                }

                System.out.println( );
                nsp = nsp - 1;
                nst = nst + 2;

        }
        nst= nst - 4;
        nsp = 1;
        for(int i = 1;i <= n - 1;i++)
        {
            for(int a = 1;a <= nsp;a++)
            {
                System.out.print("  ");
            }
         for(int j = 1;j<= nst;j++)
         {
             System.out.print("* ");
         }
            nst = nst - 2;
            nsp++;
            System.out.println();
        }

    }
}
