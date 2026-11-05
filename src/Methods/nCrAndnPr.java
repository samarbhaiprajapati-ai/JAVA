package Methods;

public class nCrAndnPr {
    public static int nPr(int n,int r)
    {
        int ans = 1;
        for(int i = 1;i <= r;i++)
        {
            ans = ans * n;
            n--;

        }
        return ans;
    }
    public static int fact(int n)
    {
        int ans = 1;
        for(int i = 1;i <= n;i++)
        {
            ans = ans * i;


        }
        return ans;
    }
    public static int nCr(int n,int r)
    {
        return (nPr(n,r) / fact(r));
    }

    static void main(String[] args) {
        System.out.println(nCr(2,2));
    }
}
