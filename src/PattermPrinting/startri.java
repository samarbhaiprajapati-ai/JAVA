package PattermPrinting;

import java.util.Scanner;

public class startri {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n;
        System.out.println("Enter The Number: ");
        n = x.nextInt();

        for(int i = 1;i <= n;i++)
        {
            for(int j = 1;j<= i;j++)
            {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
}
