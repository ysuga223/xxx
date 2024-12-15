package case5;

public class Case5 {

    public static void main(String[] args) {

        // Case5SourceDtoに以下の情報をセット。その後Case5TargetDtoに値を詰め替えてCase5TargetDtoのデータを表示して
        // id : PIT99999
        // name : Yamada
        // age : 100
        Case5SourceDto case5SourceDto = new Case5SourceDto();
        case5SourceDto.setId("PIT99999");
        case5SourceDto.setName("Yamada");
        case5SourceDto.setAge(100);

        Case5TargetDto case5TargetDto = new Case5TargetDto();
        case5TargetDto.setUserId(case5SourceDto.getId());
        case5TargetDto.setUserName(case5SourceDto.getName());
        case5TargetDto.setAge(case5SourceDto.getAge());

        System.out.println(case5TargetDto.getUserId());
        System.out.println(case5TargetDto.getUserName());
        System.out.println(case5TargetDto.getAge());
    }

}
