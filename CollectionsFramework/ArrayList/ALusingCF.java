package CollectionsFramework.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ALusingCF {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();  //Single digits no.
        ArrayList<Integer> l2 = new ArrayList<>(5); //Double digit no.
        l1.add(7);
        l1.add(8);
        l1.add(9);
        l2.add(10);
        l2.add(11);
        l2.add(12);

        l1.add(0, 6);
        l1.add(1, 7);

        l1.addAll(l2);  //adds elements of l2 at last
        
        //l1.addAll(0, l2);  //Adds l2 from 0th index
        
        //to add elements in between
        l1.add(3, 33);
        l1.set(0, 66);

        System.err.println("here");
        l1.subList(1, 3); //elements from index 1 to 3(Excluding)
        //l1.retainAll(l2); //Removes all element from l1 of l2
        //l1.removeIf(n-> (n%2==0));
        // l1.remove(l1.get(0));
        
        int size = l1.size();
        System.out.println(size);

        //l1.clear();  //clears the list

        //to get an element
        int element = l1.get(2);
        System.out.println(element);
        
        System.out.println(l1.contains(13));
        System.out.println(l2.contains(10));

        System.out.println(l1.indexOf(9));
        System.out.println(l2.indexOf(123));
        System.out.println(l1.indexOf(7)); //index of 7 that appears for the first time
        System.out.println(l1.lastIndexOf(7)); //index of 7 that appears for the last time

        //loop
        for(int i=0; i<l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
        System.out.println();

        //sorting the list
        l1.add(0);
        Collections.sort(l1);
        System.out.println(l1);
        
    }
}
