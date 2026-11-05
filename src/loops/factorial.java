package loops;

import java.util.Scanner;

public class factorial {
    static void main(String[] args) {
        int n, fact =1;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        n = x.nextInt();
        System.out.print(n + "!= ");
        for(;n!= 1 && n!= 0;n--)
        {
            fact = fact * n;
        }
        System.out.println(fact);
    }
}
