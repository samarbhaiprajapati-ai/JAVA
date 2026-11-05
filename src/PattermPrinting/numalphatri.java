package PattermPrinting;

import java.util.Scanner;

public class numalphatri {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n;
        System.out.print("Enter The Number: ");
        n = x.nextInt();

        for(int i = 1;i <= n;i++)
        {
            for(int j = 1;j<= i;j++)
            {   if(i % 2 == 0)
                  System.out.print((char)(j+ 64)+ " ");
                else
                  System.out.print(j+ " ");

            }
            System.out.println( );
        }
    }
}
