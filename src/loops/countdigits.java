package loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class countdigits {
    static void main() {
        int n,count = 0;
        System.out.print("Enter The Number: ");
        Scanner x = new Scanner(System.in);
        n = x.nextInt();
        if(n == 0) n =6;
        while(n != 0)
        {
            n= n / 10;
            count++;
        }

        System.out.println("Digits = " + count);
    }
}
