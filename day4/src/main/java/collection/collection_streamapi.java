package collection;

import bugdemo.dto.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class collection_streamapi {
    public static void main(String[] args) {
        var list = List.of(new Person("A", 10), new Person("B", 20), new Person("C", 30), new Person("D", 10), new Person("E", 20));
        Map<Integer, List<Person>> ageWiseGroup = list.stream().collect(Collectors.groupingBy(Person::getAge));
        System.out.println(ageWiseGroup);

        long count = list.stream().count();
        System.out.println("Count: " + count);

        var l = List.of(3,2,4,5,3,4,5,6,3,4);
        var map =l.stream().collect(Collectors.teeing(
           Collectors.summingInt(Integer::intValue),
           Collectors.averagingInt(Integer::intValue),
           (sum, avg)-> Map.of("sum", sum ,
                   "avg", avg)
        ));
        System.out.println(map);

        Map<Integer, Map<String, ? extends Number>> mapWithage = list.stream().collect(Collectors.groupingBy(Person::getAge,
                Collectors.teeing(
                        Collectors.counting(),
                        Collectors.averagingInt(Person::getAge),
                        (count1, avg1)-> Map.of("Count", count1,
                            "Average age", avg1
                        )
                )
                ));
        System.out.println(mapWithage);
    }
}
