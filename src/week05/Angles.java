package week05;



import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter angle 1");
        int angle1 = input.nextInt();
        System.out.println("Enter angle 2");
        int angle2 = input.nextInt();
        System.out.println("Enter angle 3");
        int angle3 = input.nextInt();
        input.close();

        int sum = angle1 + angle2 + angle3;

        if(sum == 180){
            System.out.println("Triangle");
        }else if(sum == 360){
            System.out.println("circle");
        }else{
            System.out.println("Cannot determine");
        }

    }

}
/*
T5Angles [Scanner, conditional]

	Create a program that will ask the user to enter 3 angles. Add to sum of the angles and print what type of shape is made from the angles.
		If the angles add up to 180 print triangle.
		If the angles add up to 360 print circle
		For any other angle print: Cannot determine

 */