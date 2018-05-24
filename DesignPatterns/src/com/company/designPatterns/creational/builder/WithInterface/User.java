package com.company.designPatterns.creational.builder.WithInterface;

/**
 * Created by amya0316 on 5/16/2018.
 */
public interface User {
    //User now been declared as an interface, thus is immutable
    //All getters need to be implemented
    public String getFirstName();

    public String getLastName();

    public int getAge();

    public String getPhone();

    public String getAddress();

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        // Builder for mandatory attributes
        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // Builder for optional attributes
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        //Return the finally consrcuted User object
        public User build() {
            User user = newUser();
            validateUserObject(user);
            return user;
        }

        private void validateUserObject(User user) {
            //Do some basic validations to check
            //if user object does not break any assumption of system
        }

        //Way to construct
        private User newUser() {
            //Introduce anonymous class
            return new User() {
                //All final attributes
                private String firstName; // required
                private String lastName; // required
                private int age; // optional
                private String phone; // optional
                private String address; // optional

                private User basedON(UserBuilder builder) {
                    this.firstName = builder.firstName;
                    this.lastName = builder.lastName;
                    this.age = builder.age;
                    this.phone = builder.phone;
                    this.address = builder.address;
                    return this;
                }

                public String getFirstName() {
                    return firstName;
                }

                public String getLastName() {
                    return lastName;
                }

                public int getAge() {
                    return age;
                }

                public String getPhone() {
                    return phone;
                }

                public String getAddress() {
                    return address;
                }

                @Override
                public String toString() {
                    return "User: " + this.firstName + ", " + this.lastName + ", " + this.age + ", " + this.phone + ", " + this.address;
                }
            }.basedON(this);
        }
    }
}
