package session_19.practice;

import java.util.Arrays;
import java.util.List;

public class SimpleStreamExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Robin", "Jack", "Wiz");
        names.stream().forEach(n -> System.out.println(n));
    }
}