package filehandling.java8writefile;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WriteFileMain {
    public static void main(String[] args) {

        Path path = Paths.get("F:\\Scala\\src\\main\\java\\filehandling\\java8writefile\\test.txt");

        try(BufferedWriter writer= Files.newBufferedWriter(path)) {
            writer.write("Hello!!!!");
        }catch (Exception e){
            System.out.println("File Not found!!");
        }

        String anotherDate = "04Apr2016";

        DateTimeFormatter df = DateTimeFormatter.ofPattern("ddMMMyyyy");
        LocalDate random = LocalDate.parse(anotherDate, df);

        System.out.println(anotherDate + " parses as " + random);
    }
}
