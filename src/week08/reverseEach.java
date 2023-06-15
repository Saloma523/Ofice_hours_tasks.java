package week08;

import utilites.StringUtils;

public class reverseEach {
    public static void main(String[] args) {}

    public static String longestPalindrome(String[] arr) {

        String reverse = "";
        String longust = "";

        for (String each : arr) {

            reverse += StringUtils.reverse(each) + "<>";

            if (reverse.equals(each) && reverse.length() > longust.length()) {
                longust = each;
            }

        }

        return longust.isEmpty() ? "no palindrime found: " : longust;

    }
}
/*
 Create a program that will define a String array with some words. Reverse each given element and assign them to a new array for all the reverse words

    Ex:
        {can, you, join, the, team} -> [nac, uoy, nioj, eht, meat]

    Note: We will use reverse logic in the next task too, so make a reusable method that can help with that part

 */
