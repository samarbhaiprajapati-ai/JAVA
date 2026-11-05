package PattermPrinting;

import java.util.Scanner;

public class bridge {

        static void main(String[] args) {
            Scanner x = new Scanner(System.in);
            int n,nst,nsp;
            System.out.println("Enter The Number: ");

            n = x.nextInt();
            nst = n - 1;
            System.out.println();

//            for(int i = 1;i <= n-1;i++)
//            {
//                for(int j =nst;j >0;j--)
//                {
//                    System.out.print("* ");
//                }
//
//                 for(int k =1; k <= (2 * i) - 3;k++)
//                 {
//                     System.out.print("  ");
//                 }
//                for(int j =nst ;j >0;j--)
//                {
//                    System.out.print("* ");
//                }
//                nst--;
//                System.out.println( );
//
//            }
            for(int i=1;i<=2*n+1;i++){
                System.out.print("* ");
            }
            System.out.println();
            for(int i=1;i<=n;i++){ // lines
                for(int j=1;j<=n+1-i;j++){ // stars
                    System.out.print("* ");
                }
                for(int j=1;j<=2*i-1;j++){ // spaces
                    System.out.print("  ");
                }
                for(int j=1;j<=n+1-i;j++){ // stars
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

}
