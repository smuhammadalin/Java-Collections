package TreeSetVsHashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(50);
        ts.add(4);
        ts.add(3);
        ts.add(2);
        ts.add(1);
        System.out.println("TreeSet contains: ");
        for (Integer temp : ts) {
            System.out.println(temp);
        }

        HashSet<Integer> hs = new HashSet<>();
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
