package com.brainacad.oop.testexcp1;

/**
 * Created by Yuriy on 28.03.2016.
 */
public class Person {
    //Create class Person with fields firstName(of String type), lastName(String), age (int).
    private String firstName;
    private String lastName;
    private int age;
    //Add to class Person setters and getters for each field.

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    //Setter in class Person which will modify age (setAge(int )) should throw InvalidAgeException when age out of range 1-120.
    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            throw new InvalidAgeException();
        }
    }
}
