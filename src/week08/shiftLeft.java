package week08;

import java.util.Arrays;

public class shiftLeft {
    public static void main(String[] args) {

        int[] arr = {17, 14, 5, 10};

        int[] sheftLeft = new int[arr.length];

        sheftLeft[sheftLeft.length-1] = arr[0];

        for (int i = 0; i < arr.length-1; i++) {// stopping before it gives length out of bound exception
            sheftLeft[i] = arr[i+1];
            //start index 0 // add from index 1

            System.out.println(Arrays.toString(sheftLeft));
        }







    }
}
/*
T1ShiftLeft [array, loop]

    Create a program that will define an int array with any number of elements. Print out the array with all the elements shifted one position to the left. The first element would be moved to the end

    Ex:
        {1, 2, 3} -> [2, 3, 1]
        {17, 14, 5, 10} -> [14, 5, 10, 17]
        {7, 0, 1} -> [0, 1, 7]

 */
