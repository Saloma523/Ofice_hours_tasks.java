package week05;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first word");
        String w1 = input.next();
        System.out.println("Enter the second word");
        String w2 = input.next();
        System.out.println("Enter the third word");
        String w3 = input.next();
        System.out.println("Enter a character");
        String ch = input.next();
        boolean ca1 = w1.contains(ch);
        boolean ca2 = w2.contains(ch);
        boolean ca3 = w3.contains(ch);

        int l1 = w1.length();
        int l2 = w2.length();
        int l3 = w3.length();

        if(l1 > l2 && l1 > l3 && ca1 == true){
            System.out.println(w1);
        }else if(l2 > l1 && l2 > l3 && ca2 == true){
            System.out.println(w2);
        }else if(l3 > l1 && l3 > l2 && ca3 == true){
            System.out.println(w3);
        }else{
            System.out.println("word not found");
        }

    }
}
/*
T6LongestWithA [Scanner, String, conditional, logical]

	Create a program that will ask the user to enter 3 words. Find the word that contains 'a' and is the longest out of the others

	ex:
		java
		mouse
		computer

	Output: java

	Extra: Instead of just checking for "a" ask the user to enter the character that should be used to determine the result

 */
