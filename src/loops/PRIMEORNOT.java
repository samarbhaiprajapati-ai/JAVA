package loops;

import java.util.Scanner;

public class PRIMEORNOT {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        boolean b = false;
        System.out.print("Enter The Number: ");
        n = sc.nextInt();
        for(int i = 2;i <= Math.sqrt(n);i++)
        {
            if(n % i == 0)
            {
                b = true;
                break;
            }
        }
        if(b||n== 1)
            System.out.println("Not Prime.");
        else
            System.out.println("Prime");
    }
}
