package Methods;

import java.util.Scanner;

public class maxof3 {
    static void main(String[] args) {
        int a,b,c;
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = x.nextInt();
        System.out.print("Enter b: ");
        b = x.nextInt();
        System.out.print("Enter c: ");
        c = x.nextInt();

        int max = Math.max(Math.max(a,b),c);
        System.out.println("Maximum = " + max);
    }
}
