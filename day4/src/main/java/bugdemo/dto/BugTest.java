package bugdemo.dto;


import java.util.HashSet;
import java.util.List;

public class BugTest {
    public static void main(String[] args) {
        var ashish = new Person("Ashish", 30);
        var vishal = new Person("Vishal", 32);

        var set = new HashSet<Person>(List.of(ashish, vishal));
        System.out.println(set.contains(ashish)); // true
        ashish.setAge(31);
        System.out.println(set.contains(ashish)); // false
    }
}
