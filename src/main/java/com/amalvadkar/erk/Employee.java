package com.amalvadkar.erk;

import java.util.Comparator;

import static java.util.Comparator.comparing;

public record Employee(String name, int age) {

    public static final Comparator<Employee> EMPLOYEE_NAME_DESC_COMPARATOR = comparing(Employee::name).reversed();

    public static Employee from(String name, int age) {
        return new Employee(name, age);
    }

    boolean isAdult() {
        return age >= 18;
    }

    Employee capitalizedEmployee() {
        String capitalizedName = capitalizedName();
        return Employee.from(capitalizedName, age);
    }

    private String capitalizedName() {
        StringBuilder capitalizedNameBuilder = new StringBuilder();
        String[] nameParts = name.split(" ");
        for (String namePart : nameParts) {
            char firstCharacter = namePart.charAt(0);
            String firstCharacterAsString = String.valueOf(firstCharacter);
            String capitalizedNamePart = namePart.replaceFirst(firstCharacterAsString, firstCharacterAsString.toUpperCase());
            capitalizedNameBuilder.append(capitalizedNamePart);
            capitalizedNameBuilder.append(" ");
        }
        return capitalizedNameBuilder.toString().trim();
    }

}
