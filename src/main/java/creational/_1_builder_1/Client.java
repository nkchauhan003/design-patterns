package creational._1_builder_1;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        UserBuilder userBuilderA = new WebUserBuilder();
        User userA = userBuilderA.name("Tech").address("New Delhi").dateOfBirth(LocalDate.of(2020, 1, 1)).build();
        System.out.println(userA);

        UserBuilder userBuilderB = new WebUserBuilder();
        User userB = userBuilderB.name("Burps").address("Old Delhi").build();
        System.out.println(userB);
    }


}
