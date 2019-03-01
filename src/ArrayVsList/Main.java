package ArrayVsList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println("Array contains: ");
        for (Integer temp : arr) {
            System.out.println(temp);
        }

        List<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println("\nList elements are:");
        Iterator it = l.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
