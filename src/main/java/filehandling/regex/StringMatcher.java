package filehandling.regex;

public class StringMatcher {
    public static boolean isThreeLetters(String s){
        return s.matches("[(MH7000)]{8}");
    }
}
