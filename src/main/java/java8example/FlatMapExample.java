package java8example;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        Path path =Paths.get("F:\\Scala\\src\\main\\java\\java8example\\flatmap.txt");

        Set setofWords = new HashSet();
        try {
          List<String> one =
                  Files.lines(path)
                    .collect(Collectors.toList());
            System.out.println(one);

        }catch (Exception e){
            System.out.println("no files");
        }

        /*try {
            Files.lines(path)
                    .map(e->e.split("\\s+"))
                    .flatMap(Arrays::stream)
                    .distinct()
                    .forEach(System.out::println);
        }catch (Exception e){
            System.out.println("File Not Found...");
        }*/

    }
}
