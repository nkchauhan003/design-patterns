package creational._1_builder_1;

public class WebUser implements User {

    private String name;
    private String address;
    private String age;

    public WebUser(String name, String address, String age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "WebUser{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
