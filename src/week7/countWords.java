package week7;

public class countWords {
    public static void main(String[] args) {

    }

    public static int countWords(String str){
        int count = 0;
        str.trim();

        for (int i = 0; i < str.length()-1; i++) {


           if(str.charAt(i) == ' '){
               count++;
           }
        }

       return count;
    }

    public static int countWords2(String str){
        int words = 1;
        str.trim();
        while (str.contains(" ")){
            words++;
            str = str.replaceFirst(" ", "");

        }
        return words;
    }

}
 /*
    T2CountWords [String, loop]
    Create a method that accepts a String and returns an int
        find how many words are in the given String and return that count
        a word is separated by a space
    Ex:
        input: "today is monday"
        output: 3
     */
