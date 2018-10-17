package regexpattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleRegularEx {
    public static void main(String[] args) {


        String string = "rege";
        string.matches("^(MH7000)$");

        String stringToSearch = "Four score and seven years ago our fathers ...";

        // specify that we want to search for two groups in the string
        Pattern p = Pattern.compile(" (\\S+or\\S+) .* (\\S+the\\S+).*");
        Matcher m = p.matcher(stringToSearch);

        // if our pattern matches the string, we can try to extract our groups
        if (m.find())
        {
            // get the two groups we were looking for
            String group1 = m.group(1);
            String group2 = m.group(2);

            // print the groups, with a wee bit of formatting
            System.out.format("'%s', '%s'\n", group1, group2);
        }

    }
}
