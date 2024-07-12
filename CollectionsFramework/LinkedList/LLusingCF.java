package CollectionsFramework.LinkedList;

import java.util.*;

public class LLusingCF{
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(7);
        l1.add(8);
        l1.add(9);

        l2.add(10);
        l2.add(11);
        l2.add(12);

        l1.add(0, 5);
        //l1.addAll(3, l1);
        l1.addAll(l2);

        l1.addLast(13);
        l1.addFirst(4);

        System.out.println(l1.contains(8));
        System.out.println(l2.indexOf(10));

        //l1.clear();

        l1.set(5, 14);

        System.out.println(l1.size());

        for(int i=0; i<l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
        //sorting
        Collections.sort(l1);
        System.out.println("\n"+l1);
        Collections.reverse(l1);
        System.out.println(l1);
    }
}
