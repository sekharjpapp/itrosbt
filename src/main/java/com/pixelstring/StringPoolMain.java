package com.pixelstring;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class StringPoolMain {
    public static void main(String[] args) {
        String str = "Sekhar";
        String str1 = "Reddy";


        String s1 = new String("Sekhar");

        System.out.printf(String.valueOf(str.hashCode())+"\n");
        System.out.printf(String.valueOf(str1.hashCode()));

       /* int[] array1 = new int[]{10, 22, 45, 6, 7, 25};



        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<array1.length;i++) {
            map.put(array1[i],i);
        }
        for(int value : map.values()) {
            //print ranks in order of array values
            System.out.println(value);
        }*/
        System.out.println("////////////////////////////////////////////////");
        List<Integer> list= new ArrayList<>(Arrays.asList(10, 22, 45, 6, 7, 25));

        TreeMap<Integer,Integer> maps = new TreeMap<>();
        for (int j=0; j<list.size();j++){
            maps.put(list.get(j),j);
        }
        for(int value1 : maps.values()) {
            //print ranks in order of array values

            System.out.println(value1);
        }
    }
}
