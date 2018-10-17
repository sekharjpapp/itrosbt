package filehandling;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReadJava8 {
    public static boolean isHeader(String s){
        return s.matches("[(MH7000)]{8}");
    }
    public static boolean isFooter(String f){
        return f.matches("[(RRRR)]{6}");
    }
    public static void main(String[] args) throws IOException {
        try {

       List<String> stringList =Files.lines(Paths.get("F:\\Scala\\src\\main\\java\\filehandling\\chines.txt"))
                     .collect(Collectors.toList());
                stringList.forEach(x -> System.out.println(x));
    }catch (Exception e){
        System.out.println("Could not found file");
        }

    }
   
}
