package hashcodeandequals;


import java.util.HashMap;
import java.util.Map;

public class hashcodeandequals {
    public static void main(String[] args) {
        Student s = new Student("H234");
        Student s2 = new Student("H234");

        System.out.println(s.equals(s2));

        Map<Student,ReportCard> studentReport= new HashMap<Student,ReportCard>();

        studentReport.put(s,new ReportCard());
        studentReport.put(s2,new ReportCard());

        System.out.println(studentReport.size());

    }
}
