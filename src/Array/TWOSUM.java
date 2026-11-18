package Array;

public class TWOSUM
{
    public static boolean twoSum(int arr[], int target)
    {
        // code here
        boolean ans = false;

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+ 1; j < arr.length; j++)
            {
                if(arr[i] + arr[j] == target)
                {
                    return true;

                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
      int[] a  = {1,1};
      int x = 2;
       boolean y = twoSum(a,x);
        System.out.println(y);

    }
}
