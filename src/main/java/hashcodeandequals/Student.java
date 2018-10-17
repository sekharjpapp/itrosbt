package hashcodeandequals;

import java.util.Objects;

public class Student {
    private String registerationNumber;

    public Student(String registerationNumber) {
        this.registerationNumber = registerationNumber;
    }

    public String getRegisterationNumber() {
        return registerationNumber;
    }

    public void setRegisterationNumber(String registerationNumber) {
        this.registerationNumber = registerationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(registerationNumber, student.registerationNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(registerationNumber);
    }
}
