package java8example;

import java.util.stream.Stream;

public class MapExMain {
    public static void main(String[] args) {
        //map
        String[] array = {"Tom","Bob","Harry"};

        Stream<String> arrayStream= Stream.of(array);
        arrayStream.map(e->e.length())
                .forEach(e-> System.out.println(e));
    }
}
