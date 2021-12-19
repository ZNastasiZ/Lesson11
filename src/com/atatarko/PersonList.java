package com.atatarko;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonList {
    private static final String[] NAME = {"Tom", "Richard", "Helena", "Sem", "Billy", "Max", "Beyonce", "Tiffany"};
    private static final String[] LAST_NAME = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson"};
    private final List<Person> personList = new ArrayList<>();

    public PersonList(int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            Person person = new Person(
                    NAME[random.nextInt(NAME.length)],
                    LAST_NAME[random.nextInt(LAST_NAME.length)]
            );
            personList.add(person);
        }
    }

    public void print() {
        for (Person p : personList) {
            System.out.printf("%-24s - %2d years [%3dkg, %3dcm]\n",
                    p.getFirstName() + " " + p.getLastName(),
                    p.getAge(),
                    p.getWeight(),
                    p.getHeight());
        }
    }
}


