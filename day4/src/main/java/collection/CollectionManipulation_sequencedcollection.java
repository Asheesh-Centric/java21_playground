package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionManipulation_sequencedcollection {
    public static void main(String[] args) {
        // here list is ArrayList not List so if you need List reference then define it explicitly
        var list = new ArrayList<Integer>(List.of(1,4,3,2,5));
        list.get(0);//1
        list.get(list.size()-1);//5

        // after sequenced collection
        list.getFirst(); // 1
        list.getLast(); // 5
        list.reversed(); // [5, 2, 3, 4, 1]



    }
}
