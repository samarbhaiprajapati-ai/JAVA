package PattermPrinting;

import java.util.Scanner;

public class ultatri {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n;
        System.out.println("Enter The Number: ");
        n = x.nextInt();

        for(int i = 1;i <= n;i++) {
            for (int j = 1; j + i <= n +1; j++) {
                System.out.print((char)(i + 64));
            }
            System.out.println( );
        }

    }
}
