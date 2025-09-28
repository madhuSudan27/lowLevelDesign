package com.Stream.practiceProblem;

import java.util.List;
import java.util.stream.Collectors;

public class EasyLevel {
    public static void main(String[] args) {

        List<Integer> numbers = StreamDatasets.numbers; // numbers = [3, 6, 2, 6, 9, 12, 15, 2, 18, 21, 30]
        /*
            Find all even numbers from numbers. — (filter, collect)

            Create a list of squares of each number. — (map)

            Remove duplicates from numbers. — (distinct)

            Count strings in words that start with letter 'a'. — (filter, count)

            Convert all strings in words to uppercase and collect to list. — (map, collect)
         */


//        findEvenNumbers(numbers);

        List<Integer>squares = listOfSquare(numbers);
        printList(squares);

        List<Integer> distinct = removeDuplicates(numbers);
        printList(distinct);

        int count = countWordStartingWithA(StreamDatasets.words);
        System.out.println(count);


    }

    public static int countWordStartingWithA(List<String> words) {
        long count = words.stream().filter(w -> w.startsWith("a")).count();
        return (int) count;
    }

    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        List<Integer> distinct = numbers.stream().distinct().collect(Collectors.toList());
        return distinct;
    }

    public static List<Integer> listOfSquare(List<Integer> numbers) {
        List<Integer> squares = numbers.stream().map(e->e*e).collect(Collectors.toList());
        return  squares;
    }

    public static void findEvenNumbers(List<Integer> numbers) {
        numbers.stream().filter((n) -> n % 2 == 0).forEach(n -> System.out.println(n));
    }

    public static void printList(List<Integer> numbers) {
        numbers.forEach(System.out::println);
    }
}
