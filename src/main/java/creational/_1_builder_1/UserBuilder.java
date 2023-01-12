package creational._1_builder_1;

import java.time.LocalDate;

// abstract builder
public interface UserBuilder {
    UserBuilder name(String name);

    UserBuilder address(String address);

    UserBuilder dateOfBirth(LocalDate localDate);

    User build();
}
