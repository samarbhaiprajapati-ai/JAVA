package loops;

import java.util.Scanner;

public class rev {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = x.nextInt();
        int  rev = 0;
        while (n!= 0)
        {

            rev = (rev * 10) +(n % 10);
            n = n / 10;


        }
        System.out.println("Reverse Number = "+ rev);
    }
}
