package loops;

import java.util.Scanner;

public class factorsolfnum {
    static void main(String[] args) {
        int n;
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        n = x.nextInt();
        for(int i = 1;i<=Math.sqrt(n);i++)
        {
            if(n % i == 0 && (n != n / i))
                System.out.print(i + " " + (n / i) + " ");
        }
    }
}
