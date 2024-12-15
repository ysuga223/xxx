package case11;

public class Case11Dto {

    private String id;
    private String name;
    private int age;

    public Case11Dto(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = 55;

    }

    public Case11Dto(String id) {
        this.id = id;
        this.name = "Yamada";
    }

    public Case11Dto() {};

    public String getId() {
        return "PIT99999";
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return 100;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {

        return "id : " + id + ", name : " + name + ", age : " + age;

    }

}
