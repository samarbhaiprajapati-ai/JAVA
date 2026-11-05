package PattermPrinting;

import java.util.Scanner;

public class spacetri {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n,a = 1;
        System.out.println("Enter The Number: ");

        n = x.nextInt();


        for(int i = 1;i <= n;i++)
        {
            a = 1;

            for(int j = 1;j<= n;j++)
            {
               if(i+j <= n )
                   System.out.print("  ");
               else {
                   System.out.print(a + " ");
                   a++;
               }
            }

            System.out.println( );
        }
    }
}
