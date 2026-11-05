package Methods;

public class passbyvalueref {
    public static void change(int a)
    {
        a = 5;
    }

    static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
