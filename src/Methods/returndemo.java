package Methods;

public class returndemo {
    public static int x()
    {
        System.out.println("err");
        return x();
    }

    static void main(String[] args) {
        System.out.println(x());
    }
}
