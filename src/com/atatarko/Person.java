package com.atatarko;

import java.util.Random;

public class Person {
    private static final Random RANDOM = new Random();
    private static final int MAX_AGE = 100;
    private static final int BASE_HEIGHT = 50;
    private static final int BASE_WEIGHT = 3;
    private static final int MIN_ADULT_HEIGHT = 150;
    private static final int MAX_ADULT_HEIGHT = 200;
    private static final int MIN_ADULT_WEIGHT = 50;
    private static final int MAX_ADULT_WEIGHT = 120;
    private static final int MIN_HEIGHT_CONSTANT = 6;
    private static final int MAX_HEIGHT_CONSTANT = 9;
    private static final int MIN_WEIGHT_CONSTANT = 3;
    private static final int MAX_WEIGHT_CONSTANT = 6;

    private String firstName;
    private String lastName;
    private int age;
    private int weight;
    private int height;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        calculateAge();
        calculateWeight();
        calculateHeight();
    }

    private void calculateAge() {
        age = RANDOM.nextInt(MAX_AGE) + 1;
    }

    private void calculateWeight() {
        double constant = 0.0;
        if (age < 18) {
            constant = MIN_WEIGHT_CONSTANT + (MAX_WEIGHT_CONSTANT - MIN_WEIGHT_CONSTANT) * RANDOM.nextDouble();
        } else {
            weight = RANDOM.nextInt(MAX_ADULT_WEIGHT - MIN_ADULT_WEIGHT + 1) + MIN_ADULT_WEIGHT;
            return;
        }

        weight = BASE_WEIGHT + (int) Math.round(age * constant);
    }

    private void calculateHeight() {
        double constant = 0.0;
        if (age < 20) {
            constant = MIN_HEIGHT_CONSTANT + (MAX_HEIGHT_CONSTANT - MIN_HEIGHT_CONSTANT) * RANDOM.nextDouble();
        } else {
            height = RANDOM.nextInt(MAX_ADULT_HEIGHT - MIN_ADULT_HEIGHT + 1) + MIN_ADULT_HEIGHT;
            return;
        }
        height = BASE_HEIGHT + (int) Math.round(age * constant);
    }
}