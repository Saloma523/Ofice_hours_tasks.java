package week05;

public class GoodString {
    public static void main(String[] args) {
        String w = "cgood";
        String index = w.substring(1,3);

        if(index.equals("go")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }







    }
}
/*T1GoodString [String, indexes]

        Create a program that will check a given String. If the word "good" starts at index 1 or 2 print true otherwise print false

        ex:
        goodday --> false
        agoodmovie --> true
        nogoodtoday -> true
        notgoodfornow -> false
        */

