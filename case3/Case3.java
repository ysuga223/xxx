package case3;

public class Case3 {

    public static void main(String[] args) {

        // 問題：System.out.println(hello);を使ってHello World!!を表示させる

        /*
         * ここにコードを書く
         */

        // 正解：Hello World!!が表示される
        // Case3Dtoを使ってHello World!!を表示して
        Case3Dto case3Dto = new Case3Dto();
        case3Dto.setHello("Hello World!!");

        System.out.println(case3Dto.getHello());
    }
}
