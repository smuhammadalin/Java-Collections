package ListVsSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println("List elements are:");
        Iterator it = l.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        Set<Integer> hs = new HashSet<>();
        hs.add(50);
        hs.add(4);
        hs.add(3);
        hs.add(2);
        hs.add(1);
        System.out.println("\nHashSet contains: ");
        for (Integer temp : hs) {
            System.out.println(temp);
        }
    }
}
