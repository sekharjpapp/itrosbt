package objctesequal;

public class ObjEquility {
    public static void main(String[] args) {

        Person person = new Person("sekhar",16);
        Person person1 = new Person("sekhar",16);

        System.out.println(person.equals(person1));
    }
}
