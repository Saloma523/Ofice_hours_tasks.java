package week08;

import utilites.ArrayUtils;
import utilites.StringUtils;

import java.util.Arrays;
import java.util.Scanner;

public class longestPalindrome {
    public static void main(String[] args) {
        String[] arr =  {"java", "long word", "civic", "apple", "racecar", "mom", "anna", "really long word"};
        System.out.println(ArrayUtils.longestPalindrome(arr));

        String longest = "";

        for(String each: arr){

            String revers = StringUtils.reverse(each);


            if ((revers.equalsIgnoreCase(each)) && revers.length() > longest.length()){

                longest = revers;


            }

        }
        System.out.println(longest);

        Scanner input = new Scanner(System.in);
        System.out.println("how many words do you want to add?");
        String[] inputWords = new String[input.nextInt()];
        input.nextLine();

        for (int i = 0; i < inputWords.length; i++) {
            System.out.println("Enter a word" + ( i +1));
            inputWords[i] = input.nextLine();

        }

        System.out.println(Arrays.toString(ArrayUtils.reverse(inputWords)));
        System.out.println(ArrayUtils.longestPalindrome(inputWords));
        input.close();


    }
}
/*
T4LongestPalindrome [array, loop, String]

    Create a program that will define a String array of words. Find the longest palindrome String from that array. If no palindrome is found print: No Palindrome Found

    Ex:
        {java, long word, civic, apple, racecar, mom, anna, really long word}
        longest palindrome is: racecar

        {abc, hello, world, java}
        No Palindrome Found

 */
