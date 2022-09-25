package cz.acamar.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task2 {

    /**
     * Task 2. Squares of a sorted array.
     * <p>
     * Given an integer array sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * Example input: [-4,-1,0,3,10]
     * Expected output: [0,1,9,16,100]
     * <p>
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * @param input - an integer array sorted in non-decreasing order
     * @return - an array of the squares of each number sorted in non-decreasing order
     */



    public static int[] squaresOfSortedArray(int[] input) {

       List<Integer> integerSet = Arrays.stream(input).boxed().map(i -> i * i).sorted().collect(Collectors.toList());

        int[] result = new int[integerSet.size()];
        int[] count = {0};

        integerSet.stream().forEach(i -> {
            result[count[0]] = i;
            count[0]++;
        });

        return result;
    }


    public static void main(String[] args)
    {
        int[] input={-4,-1,0,3,10};

        System.out.println(Arrays.toString(squaresOfSortedArray(input)));

    }

}
