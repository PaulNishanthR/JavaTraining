package J_Collection;

import java.util.HashSet;
import java.util.Iterator;

public class J_Set {

    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        //TreeSet gives order and ascending order
        Integer one=1;
        integers.add(one);
        integers.add(one);
        integers.add(1);
        integers.add(2);
        integers.add(one);
//        integers.add(null);
        integers.add(3);
        System.out.println("For loop");
        for (int i : integers) {
            System.out.println(i);
        }
        System.out.println("Iterator");
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
