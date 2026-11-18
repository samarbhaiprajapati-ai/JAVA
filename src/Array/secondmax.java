package Array;

public class secondmax {
   public static int  getSecondLargest(int[] arr) {
        // code here
        int max = arr[0],sidx = 0;
        for(int i = 1;i < arr.length;i++)
        {
            if(arr[i] > max)
            {

                max = arr[i];
            }
        }
       System.out.println(max);
       for(int i = 0;i < arr.length;i++)
       {
           if(arr[i] > sidx)
           {

               if(arr[i] != max) sidx =arr[i];
           }

       }
       if(sidx == 0)
       {
           return -1;
       }
       return sidx;

    }
     static void main(String[] args) {
       int[] a = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(a));
    }
}
