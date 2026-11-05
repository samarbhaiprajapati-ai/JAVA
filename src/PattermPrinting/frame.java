package PattermPrinting;

import java.util.Scanner;

public class frame {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int rows,cols;
        System.out.print("Enter Rows: ");
        rows = x.nextInt();

        System.out.print("Enter Coulmns: ");
        cols = x.nextInt();

        for(int i = 1;i <= rows;i++)
        {
            for(int j = 1;j <= cols;j++)
            {
                if(i == 1 || i == rows || j == 1 || j == cols)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
