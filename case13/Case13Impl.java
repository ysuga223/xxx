package case13;

public class Case13Impl implements Case13Interface {

    public void dispHello(String aaa) {
        System.out.println(aaa);

    }

    public int calc(int a, int b, int c) {
        int total = a + b + c;
        return total;
    }

}
