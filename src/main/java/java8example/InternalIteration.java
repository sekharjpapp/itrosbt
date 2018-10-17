package java8example;

import java.util.Arrays;
import java.util.List;

public class InternalIteration {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("Joe"), new Person("Jim"), new Person("John"));

        persons.stream().forEach(System.out::println);
    }
}
class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}