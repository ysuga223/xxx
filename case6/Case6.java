package case6;

import java.util.ArrayList;
import java.util.List;

public class Case6 {

    public static void main(String[] args) {

        List<Case6Dto> case6DtoList = new ArrayList<Case6Dto>();
        Case6Dto case6Dto1 = new Case6Dto();
        case6Dto1.setId("PIT99999");
        case6Dto1.setName("Yamada");
        case6Dto1.setAge(100);

        Case6Dto case6Dto2 = new Case6Dto();
        case6Dto2.setId("PIT00000");
        case6Dto2.setName("Tanaka");
        case6Dto2.setAge(10);

        case6DtoList.add(case6Dto1);
        case6DtoList.add(case6Dto2);



        // 出力結果が以下になること
        // id : PIT99999, name : Yamada, age : 100
        // id : PIT00000, name : Tanaka, age : 10
        for (Case6Dto case6Dto : case6DtoList) {
            System.out.println(case6Dto);
        }
    }

}
