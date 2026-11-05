package loops;

import java.util.Scanner;

public class hw {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        for(int i = 1;i <= (2 * n); i++)
        {
            if(i % 2 != 0)
            {
                System.out.println(a);

            }
            else
            {
                System.out.println(n - a + 1);
                a++;
            }
        }

    }
}
