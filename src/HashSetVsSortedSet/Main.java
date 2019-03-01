package HashSetVsSortedSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(50);
        hs.add(4);
        hs.add(3);
        hs.add(2);
        hs.add(1);
        System.out.println("HashSet contains: ");
        for (Integer temp : hs) {
            System.out.println(temp);
        }

        SortedSet<Integer> ss = new TreeSet<>();
        ss.add(50);
        ss.add(4);
        ss.add(3);
        ss.add(2);
        ss.add(1);
        System.out.println("\nSortedSet contains: ");
        for (Integer temp : ss) {
            System.out.println(temp);
        }
    }
}
