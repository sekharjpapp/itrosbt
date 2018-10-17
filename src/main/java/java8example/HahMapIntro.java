package java8example;

import java.util.HashMap;
import java.util.Map;

public class HahMapIntro {
    public static void main(String[] args) {
        Map mapA = new HashMap();

        mapA.put("key1", "element 1");
        mapA.put("key2", "element 2");
        mapA.put("key3", "element 3");

        String ele1 = (String) mapA.get("key1");
        System.out.println(ele1);
    }
}
