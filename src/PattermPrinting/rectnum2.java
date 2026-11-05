package PattermPrinting;

import java.util.Scanner;

public class rectnum2 {
    static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int n;
        System.out.print("Enter Rows: ");
        n = x.nextInt();



        for(int i = 1;i <= n;i++)
        {
            for(int j = 1;j <= n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
