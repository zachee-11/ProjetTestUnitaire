package isen.library;

public class Person {
    private String name;
    private int year;

    public Person() {
        this.name = "unknown";
        this.year = 22;
    }

    public String getName() {
        return this.name;

    }

    public int getYear() {
        return this.year;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setYear(int y) {
        this.year = y;
    }

}
