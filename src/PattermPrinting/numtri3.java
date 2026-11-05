package PattermPrinting;

import java.util.Scanner;

public class numtri3 {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n,a;
        System.out.println("Enter The Number: ");

        n = x.nextInt();
        System.out.println();

        for(int i = 1;i <= n;i++)
        {
            a = 1;
            for(int j = 1;j<= i;j++)
            {
                System.out.print(a + " ");
                a += 2;
            }

            System.out.println( );
        }
    }
}
