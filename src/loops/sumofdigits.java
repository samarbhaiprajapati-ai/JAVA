package loops;

import java.util.Scanner;

public class sumofdigits {
    static void main() {
        int n,Sum = 0;
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        n = x.nextInt();
        while(n != 0)
        {


            Sum = Sum + (n % 10);
            n=n/10;

        }
        if(Sum < 0) Sum = -Sum;
        System.out.println("Sum Of Digits: " + Sum);
    }
}
