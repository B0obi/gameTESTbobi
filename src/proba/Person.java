package proba;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
    private int Person;

    {
        Person = 36;
    }

    public int getPerson() {
        return Person;
    }
    //comment put hare
    public void setPerson(int person) {
        Person = person;
    }
    // TODO:
}
