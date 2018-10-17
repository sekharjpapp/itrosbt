package filehandling;

import java.io.File;
import java.util.Scanner;

public class ReadFile {

    private Scanner x;

    public void openFile(){
        try {
            x = new Scanner(new File("F:\\Scala\\src\\main\\java\\filehandling\\chines.txt"));
        }catch (Exception e){
            System.out.println("Could not found file");
        }

    }
    public void readFile(){
        while (x.hasNext()){
            String a = x.next();
           //String b = x.next();
            //String c = x.next();

            System.out.printf("%s  ", a);
        }
    }
    public void closeFile(){
        x.close();
    }
}
