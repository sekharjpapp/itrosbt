package collectionsds;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Car> treeSet= new TreeSet<>();

        for (int i=0;i<100;i++){
            Car c = new Car("H-"+i);
            c.setPrice((int)(Math.random()*100)+1);
            treeSet.add(c);
        }
        Car c3 = new Car("H-499");

        c3.setPrice(50);
        treeSet.add(c3);
        Iterator<Car> carIterator= treeSet.iterator();
        while (carIterator.hasNext()){
            Car c = carIterator.next();
            System.out.println(c+ "Price -" +c.getPrice());
        }
    }
}
