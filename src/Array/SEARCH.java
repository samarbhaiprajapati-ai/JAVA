package Array;

import java.util.Scanner;

public class SEARCH {
    public static void print(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void search(int[]arr ,int ele)
    {
        int Issearch = 0;
        for (int i = 0; i < arr.length; i++) {
            if(ele == arr[i])
            {
                Issearch = i;
                break;
            }

        }
        if(Issearch == 0)
            System.out.println("Not Found.");
        else
            System.out.println("Element At Index: "+ Issearch);


    }

    static void main(String[] args) {
        int n;
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Length: ");
        n = a.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 +"Th Number: " );
            arr[i] = a.nextInt();

        }
        int x = a.nextInt();
        search(arr,x);
    }
}
