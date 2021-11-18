package org.team2168.junit.LibLessons;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.team2168.LibLessons.Date;
import org.team2168.LibLessons.Person;

public class PersonTest {

    @Test
    void can_init_person() {
        Person person = new Person("Grace");

        assertNotNull(person);
    }

    @Test
    void can_init_with_dates() {
        Person person = new Person("Ada", new Date(), new Date());

        assertNotNull(person);
    }

    @Test
    void can_set_birthday() {
        Person person = new Person("Alan");
        Date newBirthday = new Date("Jun", 23, 1912);

        person.setBirthday(newBirthday);
        assertEquals(newBirthday, person.getBirthday());
    }

    @Test
    void can_set_deathday() {
        Person person = new Person("Alan");
        Date newDeathday = new Date("Jun", 7, 1954);

        person.setDeathday(newDeathday);
        assertEquals(newDeathday, person.getDeathday());
    }

    @Test
    void can_set_name() {
        Person person = new Person("Ken");
        String newName = "Dennis";

        person.setName(newName);
        assertEquals(newName, person.getName());
    }
}
