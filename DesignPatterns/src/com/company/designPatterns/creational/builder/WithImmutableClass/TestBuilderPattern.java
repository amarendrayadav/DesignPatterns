package com.company.designPatterns.creational.builder.WithImmutableClass;

/**
 * Created by amya0316 on 5/16/2018.
 */
public class TestBuilderPattern {

    public void testBuilder() {
        User user1 = new User.UserBuilder("Amrendra", "Yadav")
                .age(28)
                .address("Bangalore")
                .phone("123512351")
                .build();
        System.out.println(user1);

        User user2 = new User.UserBuilder("Jack", "Reacher")
                .age(40)
                .phone("5655")
                //no address
                .build();

        System.out.println(user2);

        User user3 = new User.UserBuilder("Super", "Man")
                //No age
                //No phone
                //no address
                .build();

        System.out.println(user3);
    }
}
