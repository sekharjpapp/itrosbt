package imparativevsdeclarative;

import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        Predicate<Integer> predicate =(i)->{return i %2 ==0;};
        System.out.println(predicate.test(4));


    }
}

