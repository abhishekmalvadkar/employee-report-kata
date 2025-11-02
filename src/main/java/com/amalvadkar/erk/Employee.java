package com.amalvadkar.erk;

public class Employee {

    private String name;
    private int age;

    private Employee(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public static Employee createEmployee(String name, int age) {
        return new Employee(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
