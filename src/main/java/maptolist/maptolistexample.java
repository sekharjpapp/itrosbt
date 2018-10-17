package maptolist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class maptolistexample {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1,"one",16));
        studentList.add(new Student(2,"Two",17));
        studentList.add(new Student(3,"Three",18));
        studentList.add(new Student(4,"Four",19));

        //studentList.forEach(item-> System.out.println(item));

        Map<Integer,Student> studentMap= new HashMap<>();

        studentMap = studentList.stream().collect(Collectors.toMap(item->item.getId(),item->item));

        studentMap.forEach((k,v)-> System.out.println(k+ " = " + v));

    }
}
