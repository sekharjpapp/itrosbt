package imparativevsdeclarative;

import java.util.Comparator;

public class COmparatorsinLambda {
    public static void main(String[] args) {
        /**
         * prior to Java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Result of the COmparator: " +comparator.compare(1,3));

        Comparator<Integer> integerComparator =( a, b)->a.compareTo(b);
        System.out.println(integerComparator.compare(3,2));
    }
}
