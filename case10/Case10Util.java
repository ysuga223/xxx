package case10;

public class Case10Util {

    public Case10Dto getUserInfo(String userName) {
        Case10Dto case9Dto = new Case10Dto();
        case9Dto.setId("PIT99999");
        case9Dto.setName(userName);
        case9Dto.setAge(100);

        return case9Dto;
    }

}
