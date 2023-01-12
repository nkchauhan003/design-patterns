package creational._1_builder_1;

import java.time.LocalDate;
import java.time.Period;

public class WebUserBuilder implements UserBuilder {
    private String name;
    private String address;
    private String age;

    @Override
    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    @Override
    public UserBuilder dateOfBirth(LocalDate localDate) {
        Period ageInYears = Period.between(localDate, LocalDate.now());
        age = Integer.toString(ageInYears.getYears());
        return this;
    }
    @Override
    public User build() {
        return new WebUser(name, address, age);
    }
}
