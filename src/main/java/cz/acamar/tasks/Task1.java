package cz.acamar.tasks;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task1 {

    /**
     * Task 1. Length of the last word.
     * <p>
     * Given a string s consisting of some words separated by some number of spaces,
     * return the length of the last word in the string.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Example input: "Hello World"
     * Expected output: 5
     *
     * @param str - a string s consisting of some words separated by some number of spaces.
     * @return - the length of the last word in the string.
     */
    public static int lengthOfLastWord(String str) {

        String[] strings=str.split(" ");
        int length=strings.length;
        String data=strings[length-1];

        //chars() is one of the Java8 method. We make a stream with chars()
        Long count=data.chars().count();


        return count.intValue();
    }



    public static void main(String[] args)
    {
       String str="Hello World";
     System.out.println( lengthOfLastWord(str));

    }

}
