package session_19.practice;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 15);

        //Sum all the numbers from the list
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum of numbers " + sum);
    }
}