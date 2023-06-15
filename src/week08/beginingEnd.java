package week08;

import java.util.Arrays;

public class beginingEnd {

    public static void main(String[] args) {
        String[] arr =  {"Anna", "Mike", "Aliya", "Remus", "Gina", "Hannah", "Nathan", "Otto", "Kevin", "Kelly"};
        String result = "";

        for(String each: arr){


            if(each.endsWith(each.substring(0,1).toLowerCase())){
               result += each + "<>";


           }

        }
        System.out.println(result);
        String[] resultArr = result.split("<>");
        System.out.println("count = " + resultArr.length);
        System.out.println(Arrays.toString(resultArr));




    }
}
/*
T2BeginningEnd [array, loop, String]

    Create a program that will define a String array with some name values. Determine how many of the names begin with and end with the same character.

    Ex:
        {Anna, Mike, Aliya, Remus, Gina, Hannah, Nathan, Otto, Kevin, Kelly}

        -> 5

    Bonus challenge: Collect all the names that start and end with the same character into an array
 */
