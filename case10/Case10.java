package case10;

public class Case10 {

    public static void main(String[] args) {

        Case10Util case10Util = new Case10Util();
        Case10Dto case10Dto = case10Util.getUserInfo("Yamada");
        System.out.println(case10Dto);

    }

}
