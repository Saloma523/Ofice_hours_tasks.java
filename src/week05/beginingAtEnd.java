package week05;

public class beginingAtEnd {
    public static void main(String[] args) {
        String word = "aducated";

        String firstCh = word.substring(0,2);

        int l = word.length()-1;
        String lastCh = word.substring(l-1);

        if(firstCh.equals( lastCh )){

            System.out.println("true");
        }else{
            System.out.println("false");
        }








    }
}
/*
T2BeginningAtEnd [String, indexes]

	Create a program that will check if the first two characters of a given String are also the last two characters of the String. Print true if they are the same and false if they are not the same

	ex:
		educated -> true
		java -> false
		eraser for the computer -> true
		panda giftwrap -> false
 */
