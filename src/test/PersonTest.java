package test;

import isen.library.Person;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
   private Person person;

    @org.junit.jupiter.api.BeforeEach
    void setUp() throws Exception {
        person = new Person();
    }

    @org.junit.jupiter.api.Test
    void testPerson(){
        assertEquals("unknown", person.getName());
        assertEquals(22, person.getYear());
    }

    @org.junit.jupiter.api.Test
    void testSetName() {
        person.setName("Panama");
        assertEquals("Panama",person.getName());
    }

    @org.junit.jupiter.api.Test
    void testSetYear() {
        person.setYear(18);
        assertEquals(18, person.getYear());

    }
}