package comparingobj;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparabeleComrator {

    public static void printSorted(List<Person> people, Comparator<Person> comparator){
        people.stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
          new Person("Sara",12),
                new Person("Mark",43),
                new Person("Bob",12),
                new Person("Jill",64)
        );
       /* Comparator<Person> comparator = (p1,p2)-> p1.getName().compareTo(p2.getName());
        printSorted(people,comparator);*/

       //printSorted(people,Comparator.comparing(Person::getName));
        printSorted(people,Comparator.comparing(Person::getAge).thenComparing(Person::getName));

    }
}
