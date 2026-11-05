package loops;

import java.util.Scanner;

public class araisedtob {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a,b,ans = 1;
        System.out.print("Enter The Base: ");
        a = x.nextInt();

        System.out.print("Enter The Power: ");
        b = x.nextInt();

        while(b != 0)
        {
            ans = ans *a;
            b--;

        }
        System.out.println(ans);
    }
}
