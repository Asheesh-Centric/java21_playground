package collection;

import java.util.LinkedHashSet;
import java.util.List;

public class linkedhashset_sequencedCollection {
    public static void main(String[] args) {
        var set = new LinkedHashSet<Integer>(List.of(3, 2, 4, 5, 6));
        set.add(9); // adds in last
        System.out.println(set);
        // but no direct way to add the elements in the beginning. so after sequence
        set.addFirst(10);
        System.out.println(set);
    }
}
