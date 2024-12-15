package case7;

import java.util.ArrayList;
import java.util.List;

public class Case7 {


    public static void main(String[] args) {
        List<Case7SourceDto> case7DtoSourceList = new ArrayList<Case7SourceDto>();
        Case7SourceDto case7SourceDto1 = new Case7SourceDto();
        case7SourceDto1.setId("PIT99999");
        case7SourceDto1.setName("Yamada");
        case7SourceDto1.setAge(100);

        Case7SourceDto case7SourceDto2 = new Case7SourceDto();
        case7SourceDto2.setId("PIT00000");
        case7SourceDto2.setName("Tanaka");
        case7SourceDto2.setAge(10);

        case7DtoSourceList.add(case7SourceDto1);
        case7DtoSourceList.add(case7SourceDto2);

        // 出力結果が以下になること
        // id : PIT99999, name : Yamada, age : 100
        // id : PIT00000, name : Tanaka, age : 10
        for (Case7SourceDto case7SourceDto : case7DtoSourceList) {
            System.out.println(case7SourceDto);
        }


        // case7DtoSourceListからcase7TargetDtoListに詰め替える
        List<Case7TargetDto> case7TargetDtoList = new ArrayList<Case7TargetDto>();
        for (Case7SourceDto case7SourceDto : case7DtoSourceList) {
            Case7TargetDto case7TargetDto = new Case7TargetDto();
            case7TargetDto.setUserId(case7SourceDto.getId());
            case7TargetDto.setUserName(case7SourceDto.getName());
            case7TargetDto.setAge(case7SourceDto.getAge());
            case7TargetDtoList.add(case7TargetDto);
        }

        // 出力結果が以下になること
        // userId : PIT99999, userName : Yamada, age : 100
        // userId : PIT00000, userName : Tanaka, age : 10
        for (Case7TargetDto case7TargetDto : case7TargetDtoList) {
            System.out.println(case7TargetDto);
        }
    }
}
