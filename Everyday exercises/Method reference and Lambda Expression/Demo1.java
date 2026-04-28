// Given a list of integers, use method reference to:
// 1. Filter even numbers
// 2. Print each even number

import java.util.List;
import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //numbers.forEach(System.out::println);
        // Using method reference to filter even numbers and print them
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}