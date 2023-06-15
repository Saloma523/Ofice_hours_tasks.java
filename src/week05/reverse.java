package week05;

public class reverse {
    public static void main(String[] args) {
        String word = "java";

        String l1 = word.substring(0,1);
        String l2 = word.substring(1,2);
        String l3 = word.substring(2,3);
        String l4 = word.substring(3,4);
        String l5 = word.substring(4,5);
        if(word.length() == 5) {
            System.out.println( l5 + l4 + l3 + l2 + l1);
        }else{
            System.out.println("invalid word length");
        }





    }
}
/*
T4Reverse [String, index]

	Create a program that will have a String that is always 5 characters long. Reverse that given String and print the reverse version

	ex:
		input: hello
		output: olleh

		input: java
		output: avaj
 */
