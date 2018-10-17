package filehandling.filesplitsol;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleMain {
    public static void main(String[] args) throws IOException {

      // Iterator<String> fileNames = Arrays.asList("one.txt", "two.txt", "three.txt").iterator();
        int i = 1;
        Pattern start = Pattern.compile("\\(AP9000\\)");
        Pattern end = Pattern.compile("\\(NNNN\\)");
        boolean reading = false;
        FileOutputStream fos = null;
        Iterator<String> lines = Files.lines(Paths.get("F:\\Scala\\src\\main\\java\\filehandling\\filesplitsol\\chinna.txt")).iterator();
        while (lines.hasNext() /* && fileNames.hasNext() */) {
            String line = lines.next();
            Matcher startMatcher = start.matcher(line);
            if (startMatcher.find()) {
                reading = true;
                fos = new FileOutputStream(String.valueOf(i++) + ".txt"/*fileNames.next()*/);
            }
            if (reading) {
                fos.write(line.getBytes(StandardCharsets.UTF_8));
                fos.write('\n');
            }
            Matcher endMatcher = end.matcher(line);
            if (endMatcher.find()) {
                if (fos != null) {
                    fos.close();
                }
                reading = false;
            }
        }
        // Close file despite of a missing end (NNNN)
        if (fos != null) {
            fos.close();
        }
    }
}
