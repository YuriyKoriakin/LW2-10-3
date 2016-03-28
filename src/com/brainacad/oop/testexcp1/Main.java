package com.brainacad.oop.testexcp1;

/**
 * Created by Yuriy on 28.03.2016.
 */
public class Main {
    public static void main(String[] args) {
//Add code to method main() to create  one Pearson object and invoke setAge method with exception handling  using
// try-catch statement
        Person person = new Person();
        try {
            person.setAge(31);
        } catch (Exception e) {
            System.out.println("Catch");//буде виведено на друк у випадку exeption
            System.out.println(e);//буде виведено на друк у випадку exeption (exeption description)
        } finally {
            System.out.println("Final");//буде виведено на друк в будь-якому випадку
        }
        System.out.println(person.getAge());//виведення на консоль продукту методу, якщо він не підпадає під exeption
    }
}

