package utilites;

public class ArrayUtils {
    public static int[] merge(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];//to contain thr elements of arr1 and arr2

        int k = 0; // for third arr index number

        for (int i = 0; i < arr1.length; i++, k++) {// i is fo the first arr index number
            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++, k++) {// i is for the second arr index number

            arr3[k] = arr2[i];

        }


        return arr3;
    }


    public static double[] merge(double[] arr1, double[] arr2) {

        double[] arr3 = new double[arr1.length + arr2.length];//to contain thr elements of arr1 and arr2
        int k = 0; // for third arr index number

        for (int i = 0; i < arr1.length; i++, k++) {// i is fo the first arr index number
            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++, k++) {// i is for the second arr index number

            arr3[k] = arr2[i];

        }


        return arr3;
    }



    public static char[] merge(char[] arr1, char[] arr2) {

        char[] arr3 = new char[arr1.length + arr2.length];//to contain thr elements of arr1 and arr2
        int k = 0; // for third arr index number

        for (int i = 0; i < arr1.length; i++, k++) {// i is fo the first arr index number
            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++, k++) {// i is for the second arr index number

            arr3[k] = arr2[i];

        }


        return arr3;
    }


    public static String[] merge(String[] arr1, String[] arr2) {

        String[] arr3 = new String[arr1.length + arr2.length];//to contain thr elements of arr1 and arr2
        int k = 0; // for third arr index number

        for (int i = 0; i < arr1.length; i++, k++) {// i is fo the first arr index number
            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++, k++) {// i is for the second arr index number

            arr3[k] = arr2[i];

        }


        return arr3;
    }


    public static int[] reverse(int[] array){

        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];

        }

        return reverse;
    }


    public static double[] reverse(double[] array){

        double[] reverse = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];

        }

        return reverse;
    }


    public static char[] reverse(char[] array){

        char[] reverse = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];

        }

        return reverse;
    }


    public static String[] reverse(String[] array){
        String[] reverse = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];

        }

        return reverse;
    }


    public static String longestPalindrome(String[] arr) {


        String longest = "";

        for (String each : arr) {

            String reverse = StringUtils.reverse(each);

            if (reverse.equals(each) && reverse.length() > longest.length()) {
                longest = each;
            }

        }

        return longest.isEmpty() ? "no palindrime found: " : longest;

    }


    public static String print2D(int[][] arr){
        String print = "*";

        for(int[] inner: arr){
            print+= "\n\t";

            for(int each: inner){
                print+= "(" + each + ")";

            }
        }


        return  print;
    }

}
