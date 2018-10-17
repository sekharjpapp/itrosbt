package imparativevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,2,3,4,4,5);

        List<Integer> uniquelist = new ArrayList<>();

        for (Integer integer:integerList){
            if (!uniquelist.contains(integer)){
                uniquelist.add(integer);
            }
        }
        System.out.println(uniquelist);

        List<Integer> uniList= integerList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniList);
    }
}
