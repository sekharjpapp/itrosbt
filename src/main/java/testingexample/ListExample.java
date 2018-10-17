package testingexample;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ListExample {
    List<String> myArray() {
        List<String> ar = new ArrayList<>();
        ar.add("Customer1");
        ar.add("Customer2");
        ar.add("Customer3");
        return ar;
    }
    public static void main(String[] args) {


    }
}
class TestcasesTest {
    @Test
    public void testMyArray() {
       ListExample testcases = new ListExample();
        assertEquals(Arrays.asList("Customer1", "Customer2", "Customer3"), testcases.myArray());
    }
}