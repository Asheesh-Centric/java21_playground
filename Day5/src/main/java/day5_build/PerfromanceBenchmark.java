package day5_build;

import java.time.Instant;
import java.util.Arrays;

public class PerfromanceBenchmark {
    public static String stringloop(int size) {
        String result = new String();
        for (int i = 0; i < size; i++) {
            result += i;
          //  System.out.println(result);
        }
        return result;
    }

    public static String strinbuilderloop(int size) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append(i);
        }
        return new String(result);
    }

    public static void main(String[] args) {
        int[] sizes = {10, 1000, 100000};
        Arrays.stream(sizes).forEach(
                size -> {
                    Long start = Instant.now().toEpochMilli();
                    PerfromanceBenchmark.stringloop(size);
                    Long time = Instant.now().toEpochMilli() - start;
                    System.out.println("time in for loop: "+time+"ms");
                }
        );
        Arrays.stream(sizes).forEach(
                size -> {
                    Long start = Instant.now().toEpochMilli();
                    PerfromanceBenchmark.strinbuilderloop(size);
                    Long time = Instant.now().toEpochMilli() - start;
                    System.out.println("StringBuilder loop : " + time+"ms");
                }
        );
    }
}
