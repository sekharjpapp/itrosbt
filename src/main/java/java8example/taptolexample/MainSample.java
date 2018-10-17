package java8example.taptolexample;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MainSample {
    public static void main(String[] args) {

       /* List<Author> authors = Arrays.asList(
                new Author("Venkat",10),
                new Author("Richord",8)
        );*/
        List<Book> books = Arrays.asList(
          new Book("Java",2006,new Author("Richord",10 )),
                new Book("scala",2007,new Author("Venkat",8))
        );

        books.stream()
                .filter(book -> book.getYear() > 2005)  // filter out books published in or before 2005
                .map(Book::getAuthor)              // get the list of authors for the remaining books
                .filter(Objects::nonNull)          // remove null authors from the list
                .map(Author::getName)              // get the list of names for the remaining authors
                .forEach(System.out::println);     // print the value of each remaining element
    }
}
