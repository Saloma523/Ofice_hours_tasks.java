package week06;

public class swapFirstAndLast {
    public static void main(String[] args) {
        System.out.println(swapFirstAndLast("abcd"));
    }

    public static String swapFirstAndLast(String str){

        int lastIndex= str.length()-1;

        char first = str.charAt(0);
        char last = str.charAt(lastIndex);
        return last + str.substring(1,lastIndex) + first;// substring takes away on

    }
}
/*
String f = str.replace(c1,c2).substring(0,1);
        String l = str.replace(c2,c1).substring(str.length()-2);
        return f + str.substring(1,str.length()-2)+l;
 */

/*
T2SwapFirstLast [methods, String]

    Create a method that has a String parameter and returns a String with the first and last character swapped

    Ex:
        code -> eodc
        ab -> ba
        fa -> a
 */
