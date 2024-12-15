package case13;

public class Case13 {

    public static void main(String[] args) {

        Case13Interface case13 = new Case13Impl();
        case13.dispHello("Hello World!!");
        int total = case13.calc(1, 2, 3);
        System.out.println(total);

    }
}
