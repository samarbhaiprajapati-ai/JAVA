package PattermPrinting;

import java.util.Scanner;

public class binarytri {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n;
        System.out.println("Enter The Number: ");

        n = x.nextInt();
        System.out.println();

        for(int i = 1;i <= n;i++)
        {
            for(int j = 1;j<= i;j++)
            {
                if((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }

            System.out.println( );
        }
    }
}
