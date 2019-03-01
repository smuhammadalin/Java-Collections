package NavigableSetVsNavigableMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        NavigableSet<Integer> ns = new TreeSet<>();
        ns.add(0);
        ns.add(1);
        ns.add(2);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        System.out.println("NavigableSet contains: ");
        for (Integer temp : ns) {
            System.out.println(temp);
        }

        NavigableMap<String, Integer> nm = new TreeMap<>();
        nm.put("one", 1);
        nm.put("two", 2);
        nm.put("three", 3);
        nm.put("four", 4);
        nm.put("five", 5);
        System.out.printf("\nOriginal Map : %s%n", nm);
        System.out.printf("\nReverse Map : %s%n", nm.descendingMap());
    }
}
