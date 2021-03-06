package filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandling {
    public static void main(String[] args) {
        try {
            String searchWord = "localhost";
            String path = "/etc/hosts";

            long count = Files.lines(Paths.get(path))
                    .filter(line -> line.contains(searchWord))
                    .count();

            System.out.printf("The word %s occured %d times\n", searchWord, count);
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
