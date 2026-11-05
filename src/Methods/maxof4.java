package Methods;

import java.util.Scanner;

public class maxof4 {
    static void main(String[] args) {
        int a,b,c,d;
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = x.nextInt();
        System.out.print("Enter b: ");
        b = x.nextInt();
        System.out.print("Enter c: ");
        c = x.nextInt();
        System.out.print("Enter d: ");
        d = x.nextInt();


        int max = Math.max(Math.max(Math.max(a,b),c),d);
        System.out.println("Maximum = " + max);
    }
}
