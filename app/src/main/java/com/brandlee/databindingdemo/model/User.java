package com.brandlee.databindingdemo.model;

/**
 * @ClassName: User
 * @Description:
 * @Author liqi1
 * @Date 2015/12/2
 */
public class User {
    private final String firstName;
    private final String lastName;
    private String displayName;
    private int age;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String firstName, String lastName, int age) {
        this(firstName, lastName);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDisplayName() {
        return firstName + " " + lastName;
    }

    public boolean isAdult() {
        return age >= 18;
    }
}
